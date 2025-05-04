package com.example.myapplication.controller;

import android.util.Log;
import com.example.myapplication.model.Operators;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import net.objecthunter.exp4j.function.Function;
import net.objecthunter.exp4j.operator.Operator;

import java.util.List;

public class CalculatorController {

    public double evaluateExpression(String expression) throws Exception {
        try {
            Log.d("CalculatorController", "Ekspresi awal: " + expression);

            // Ganti simbol dengan ekspresi yang didukung oleh exp4j
            // PENTING: Ganti P dengan # dan C dengan $ untuk operator kustom
            expression = expression.replace("×", "*")
                    .replace("÷", "/")
                    .replace("π", String.valueOf(Math.PI))
                    .replace("P", "#")  // Ganti P dengan # untuk permutasi
                    .replace("C", "$"); // Ganti C dengan $ untuk kombinasi

            Log.d("CalculatorController", "Ekspresi yang dikonversi: " + expression);

            // Buat builder dengan fungsi khusus
            ExpressionBuilder builder = new ExpressionBuilder(expression);

            // Daftarkan fungsi trigonometri (dalam radian)
            builder.function(new Function("sin", 1) {
                @Override
                public double apply(double... args) {
                    // Konversi dari derajat ke radian untuk kemudahan pengguna
                    return Math.sin(Math.toRadians(args[0]));
                }
            });

            builder.function(new Function("cos", 1) {
                @Override
                public double apply(double... args) {
                    return Math.cos(Math.toRadians(args[0]));
                }
            });

            builder.function(new Function("tan", 1) {
                @Override
                public double apply(double... args) {
                    return Math.tan(Math.toRadians(args[0]));
                }
            });

            builder.function(new Function("log", 1) {
                @Override
                public double apply(double... args) {
                    if (args[0] <= 0) {
                        throw new IllegalArgumentException("Logaritma natural tidak bisa digunakan untuk angka non-positif");
                    }
                    return Math.log(args[0]); // Logaritma natural (basis e)
                }
            });

            builder.function(new Function("log10", 1) {
                @Override
                public double apply(double... args) {
                    if (args[0] <= 0) {
                        throw new IllegalArgumentException("Logaritma basis 10 tidak bisa digunakan untuk angka non-positif");
                    }
                    return Math.log10(args[0]); // Logaritma basis 10
                }
            });

            builder.function(new Function("sqrt", 1) {
                @Override
                public double apply(double... args) {
                    if (args[0] < 0) {
                        throw new IllegalArgumentException("Akar kuadrat dari angka negatif tidak terdefinisi");
                    }
                    return Math.sqrt(args[0]);
                }
            });

            builder.function(new Function("round", 1) {
                @Override
                public double apply(double... args) {
                    return Math.round(args[0]);
                }
            });

            // Daftarkan operator khusus (faktorial, permutasi, kombinasi)
            List<Operator> ops = Operators.getOperators();
            for (Operator op : ops) {
                try {
                    builder.operator(op);
                    Log.d("CalculatorController", "Operator berhasil didaftarkan: " + op.getSymbol());
                } catch (Exception e) {
                    Log.e("CalculatorController", "Gagal mendaftarkan operator: " + op.getSymbol() + ", error: " + e.getMessage());
                    throw e;
                }
            }

            // Build dan evaluasi ekspresi
            Expression exp = builder.build();
            double result = exp.evaluate();

            Log.d("CalculatorController", "Hasil: " + result);
            return result;

        } catch (Exception e) {
            Log.e("CalculatorController", "Error evaluating: " + e.getMessage(), e);
            throw new Exception("Ekspresi tidak valid: " + e.getMessage());
        }
    }
}