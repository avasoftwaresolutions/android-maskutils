package com.plpellegrini.maskutils;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class MaskUtils {

    private static final String MASK_CPF = "###.###.###-##";
    private static final String MASK_CNPJ = "##.###.###/####-##";
    private static final String MASK_PHONE_RESIDENTIAL = "(##) ####-####";
    private static final String MASK_PHONE_CELLPHONE = "(##) #####-####";
    private static final String MASK_CEP = "#####-###";

    public static void cpfCnpjMask(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            boolean isUpdating;
            String old = "";

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = unmaskNums(s.toString());
                String mask;
                String defaultMask = getDefaultCpfCnpjMask(str);
                switch (str.length()) {
                    case 11:
                        mask = MASK_CPF;
                        break;
                    case 14:
                        mask = MASK_CNPJ;
                        break;

                    default:
                        mask = defaultMask;
                        break;
                }

                StringBuilder mascara = new StringBuilder();
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : mask.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        mascara.append(m);
                        continue;
                    }

                    try {
                        mascara.append(str.charAt(i));
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                editText.setText(mascara.toString());
                editText.setSelection(mascara.length());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            public void afterTextChanged(Editable s) { }
        });
    }

    public static void cpfMask(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            boolean isUpdating;
            String old = "";

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = unmaskNums(s.toString());
                StringBuilder maskedStr = new StringBuilder();
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : MASK_CPF.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        maskedStr.append(m);
                        continue;
                    }

                    try {
                        maskedStr.append(str.charAt(i));
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                editText.setText(maskedStr.toString());
                editText.setSelection(maskedStr.length());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            public void afterTextChanged(Editable s) { }
        });
    }

    public static void cnpjMask(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            boolean isUpdating;
            String old = "";

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = unmaskNums(s.toString());

                StringBuilder maskedStr = new StringBuilder();
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : MASK_CNPJ.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        maskedStr.append(m);
                        continue;
                    }

                    try {
                        maskedStr.append(str.charAt(i));
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                editText.setText(maskedStr.toString());
                editText.setSelection(maskedStr.length());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            public void afterTextChanged(Editable s) { }
        });
    }

    public static void phoneMask(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            boolean isUpdating;
            String old = "";

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = unmaskNums(s.toString());
                String mask;
                String defaultMask = getDefaultPhoneMask(str);
                switch (str.length()) {
                    case 10:
                        mask = MASK_PHONE_RESIDENTIAL;
                        break;
                    case 11:
                        mask = MASK_PHONE_CELLPHONE;
                        break;

                    default:
                        mask = defaultMask;
                        break;
                }

                StringBuilder mascara = new StringBuilder();
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : mask.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        mascara.append(m);
                        continue;
                    }

                    try {
                        mascara.append(str.charAt(i));
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                editText.setText(mascara.toString());
                editText.setSelection(mascara.length());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            public void afterTextChanged(Editable s) { }
        });
    }

    public static void cepMask(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            boolean isUpdating;
            String old = "";

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = unmaskNums(s.toString());

                StringBuilder maskedStr = new StringBuilder();
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : MASK_CEP.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        maskedStr.append(m);
                        continue;
                    }

                    try {
                        maskedStr.append(str.charAt(i));
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                editText.setText(maskedStr.toString());
                editText.setSelection(maskedStr.length());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            public void afterTextChanged(Editable s) { }
        });
    }

    public static void moneyMask(final EditText editText) {
        editText.addTextChangedListener(new TextWatcher() {
            boolean isUpdating;
            String old = "";

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void afterTextChanged(Editable s) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                String str = unmaskNums(s.toString());
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                BigDecimal parsed = new BigDecimal(str)
                        .setScale(2, BigDecimal.ROUND_FLOOR)
                        .divide(new BigDecimal(100), BigDecimal.ROUND_FLOOR);
                String formatted = NumberFormat.getCurrencyInstance().format(parsed);
                isUpdating = true;
                editText.setText(formatted);
                editText.setSelection(formatted.length());
            }
        });
    }

    public static void customMask(final EditText editText, final String pattern) {
        editText.addTextChangedListener(new TextWatcher() {
            boolean isUpdating;
            String old = "";

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String str = unmask(s.toString());

                StringBuilder maskedStr = new StringBuilder();
                if (isUpdating) {
                    old = str;
                    isUpdating = false;
                    return;
                }
                int i = 0;
                for (char m : pattern.toCharArray()) {
                    if ((m != '#' && str.length() > old.length()) || (m != '#' && str.length() < old.length() && str.length() != i)) {
                        maskedStr.append(m);
                        continue;
                    }

                    try {
                        maskedStr.append(str.charAt(i));
                    } catch (Exception e) {
                        break;
                    }
                    i++;
                }
                isUpdating = true;
                editText.setText(maskedStr.toString());
                editText.setSelection(maskedStr.length());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            public void afterTextChanged(Editable s) { }
        });
    }

    private static String getDefaultCpfCnpjMask(String str) {
        String defaultMask = MASK_CPF;
        if (str.length() > 11) {
            defaultMask = MASK_CNPJ;
        }
        return defaultMask;
    }

    private static String getDefaultPhoneMask(String str) {
        String defaultMask = MASK_PHONE_RESIDENTIAL;
        if (str.length() > 10) {
            defaultMask = MASK_PHONE_CELLPHONE;
        }
        return defaultMask;
    }

    private static String unmask(String s) {
        return s.replaceAll("[^0-9a-zA-Z]*", "");
    }

    private static String unmaskNums(String s) {
        return s.replaceAll("[^0-9]*", "");
    }
}
