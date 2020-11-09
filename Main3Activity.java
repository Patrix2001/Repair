package com.example.sekali;

 

import androidx.appcompat.app.AppCompatActivity;

 

import android.content.Intent;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;

import android.widget.RadioGroup;

import android.widget.Toast;

 

 

@SuppressWarnings("ALL")

public class Main3Activity extends AppCompatActivity {


private RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5, radioGroup6,

    radioGroup7, radioGroup8, radioGroup9, radioGroup10, radioGroup11, radioGroup12,

    radioGroup13, radioGroup14;

    Button btn;

    private int jumlahPoint, jumlahPoint1, jumlahPoint2, jumlahPoint3, jumlahPoint4, jumlahPoint5,
            jumlahPoint6, jumlahPoint7, jumlahPoint8, jumlahPoint9, jumlahPoint10, jumlahPoint11,
            jumlahPoint12, jumlahPoint13, jumlahPoint14;


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main3);

        initRadioGroup();

        initButton();

        radioGroupListener();


        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                if (

                        radioGroup1.getCheckedRadioButtonId() == -1 ||

                                radioGroup2.getCheckedRadioButtonId() == -1 ||

                                radioGroup3.getCheckedRadioButtonId() == -1 ||

                                radioGroup4.getCheckedRadioButtonId() == -1 ||

                                radioGroup5.getCheckedRadioButtonId() == -1 ||

                                radioGroup6.getCheckedRadioButtonId() == -1 ||

                                radioGroup7.getCheckedRadioButtonId() == -1 ||

                                radioGroup8.getCheckedRadioButtonId() == -1 ||

                                radioGroup9.getCheckedRadioButtonId() == -1 ||

                                radioGroup10.getCheckedRadioButtonId() == -1 ||

                                radioGroup11.getCheckedRadioButtonId() == -1 ||

                                radioGroup12.getCheckedRadioButtonId() == -1 ||

                                radioGroup13.getCheckedRadioButtonId() == -1 ||

                                radioGroup14.getCheckedRadioButtonId() == -1


                ) {

                    // tidak ada radioButton yang terClick

                    Toast.makeText(getApplicationContext(), "Harap Isi Semua Pertanyaan!", Toast.LENGTH_LONG).show();

                } else {

                    // 1 radioButton ada yang terClick
                    jumlahPoint = jumlahPoint1 + jumlahPoint2 + jumlahPoint3 + jumlahPoint4 + jumlahPoint5 +
                            jumlahPoint6 + jumlahPoint7 + jumlahPoint8 + jumlahPoint9 + jumlahPoint10 +
                            jumlahPoint11 + jumlahPoint12 + jumlahPoint13 + jumlahPoint14;

                    Intent i = new Intent(Main3Activity.this, Main10Activity.class);

                    i.putExtra("TOTAL_POINT", jumlahPoint);

                    startActivity(i);

                }

            }

        });
    }


    @Override

    protected void onResume() {

        super.onResume();

        // Menetepkan nilai default jumlah point

        jumlahPoint = 0;

    }

    //Menginisialisasi Buttonnya

    private void initButton() {

        btn = findViewById(R.id.btn);

    }


    // Menginisialisasi semua RadioGroup

    private void initRadioGroup() {

        radioGroup1 = findViewById(R.id.radio_group1);

        radioGroup2 = findViewById(R.id.radio_group2);

        radioGroup3 = findViewById(R.id.radio_group3);

        radioGroup4 = findViewById(R.id.radio_group4);

        radioGroup5 = findViewById(R.id.radio_group5);

        radioGroup6 = findViewById(R.id.radio_group6);

        radioGroup7 = findViewById(R.id.radio_group7);

        radioGroup8 = findViewById(R.id.radio_group8);

        radioGroup9 = findViewById(R.id.radio_group9);

        radioGroup10 = findViewById(R.id.radio_group10);

        radioGroup11 = findViewById(R.id.radio_group11);

        radioGroup12 = findViewById(R.id.radio_group12);

        radioGroup13 = findViewById(R.id.radio_group13);

        radioGroup14 = findViewById(R.id.radio_group14);

    }


    // Aksi untuk menambahkan point ketika salah satu radio button di pilih

    private void radioGroupListener() {

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton1:

                        jumlahPoint1 = 0;

                        break;

                    case R.id.RadioButton2:

                        jumlahPoint1 = 1;

                        break;

                    case R.id.RadioButton3:

                        jumlahPoint1 = 2;

                        break;

                    case R.id.RadioButton4:

                        jumlahPoint1 = 3;

                        break;

                    case R.id.RadioButton5:

                        jumlahPoint1 = 4;

                        break;

                }

            }

        });


        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton6:

                        jumlahPoint2 = 0;

                        break;

                    case R.id.RadioButton7:

                        jumlahPoint2 = 1;

                        break;

                    case R.id.RadioButton8:

                        jumlahPoint2 = 2;

                        break;

                    case R.id.RadioButton9:

                        jumlahPoint2 = 3;

                        break;

                    case R.id.RadioButton10:

                        jumlahPoint2 = 4;

                        break;

                }

            }

        });


        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton11:

                        jumlahPoint3 = 0;

                        break;

                    case R.id.RadioButton12:

                        jumlahPoint3 = 1;

                        break;

                    case R.id.RadioButton13:

                        jumlahPoint3 = 2;

                        break;

                    case R.id.RadioButton14:

                        jumlahPoint3 = 3;

                        break;

                    case R.id.RadioButton15:

                        jumlahPoint3 = 4;

                        break;

                }

            }

        });


        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton16:

                        jumlahPoint4 = 0;

                        break;

                    case R.id.RadioButton17:

                        jumlahPoint4 = 1;

                        break;

                    case R.id.RadioButton18:

                        jumlahPoint4 = 2;

                        break;

                    case R.id.RadioButton19:

                        jumlahPoint4 = 3;

                        break;

                    case R.id.RadioButton20:

                        jumlahPoint4 = 4;

                        break;

                }

            }

        });


        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton21:

                        jumlahPoint5 = 0;

                        break;

                    case R.id.RadioButton22:

                        jumlahPoint5 = 1;

                        break;

                    case R.id.RadioButton23:

                        jumlahPoint5 = 2;

                        break;

                    case R.id.RadioButton24:

                        jumlahPoint5 = 3;

                        break;

                    case R.id.RadioButton25:

                        jumlahPoint5 = 4;

                        break;

                }

            }

        });


        radioGroup6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton26:

                        jumlahPoint6 = 0;

                        break;

                    case R.id.RadioButton27:

                        jumlahPoint6 = 1;

                        break;

                    case R.id.RadioButton28:

                        jumlahPoint6 = 2;

                        break;

                    case R.id.RadioButton29:

                        jumlahPoint6 = 3;

                        break;

                    case R.id.RadioButton30:

                        jumlahPoint6 = 4;

                        break;

                }

            }

        });


        radioGroup7.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton31:

                        jumlahPoint7 = 0;

                        break;

                    case R.id.RadioButton32:

                        jumlahPoint7 = 1;

                        break;

                    case R.id.RadioButton33:

                        jumlahPoint7 = 2;

                        break;

                    case R.id.RadioButton34:

                        jumlahPoint7 = 3;

                        break;

                    case R.id.RadioButton35:

                        jumlahPoint7 = 4;

                        break;

                }

            }

        });


        radioGroup8.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton36:

                        jumlahPoint8 = 0;

                        break;

                    case R.id.RadioButton37:

                        jumlahPoint8 = 1;

                        break;

                    case R.id.RadioButton38:

                        jumlahPoint8 = 2;

                        break;

                    case R.id.RadioButton39:

                        jumlahPoint8 = 3;

                        break;

                    case R.id.RadioButton40:

                        jumlahPoint8 = 4;

                        break;

                }

            }

        });


        radioGroup9.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton41:

                        jumlahPoint9 = 0;

                        break;

                    case R.id.RadioButton42:

                        jumlahPoint9 = 1;

                        break;

                    case R.id.RadioButton43:

                        jumlahPoint9 = 2;

                        break;

                    case R.id.RadioButton44:

                        jumlahPoint9 = 3;

                        break;

                    case R.id.RadioButton45:

                        jumlahPoint9 = 4;

                        break;

                }

            }

        });


        radioGroup10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton46:

                        jumlahPoint10 = 0;

                        break;

                    case R.id.RadioButton47:

                        jumlahPoint10 = 1;

                        break;

                    case R.id.RadioButton48:

                        jumlahPoint10 = 2;

                        break;

                    case R.id.RadioButton49:

                        jumlahPoint10 = 3;

                        break;

                    case R.id.RadioButton50:

                        jumlahPoint10 = 4;

                        break;

                }

            }

        });


        radioGroup11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton51:

                        jumlahPoint11 = 0;

                        break;

                    case R.id.RadioButton52:

                        jumlahPoint11 = 1;

                        break;

                    case R.id.RadioButton53:

                        jumlahPoint11 = 2;

                        break;

                    case R.id.RadioButton54:

                        jumlahPoint11 = 3;

                        break;

                    case R.id.RadioButton55:

                        jumlahPoint11 = 4;

                        break;

                }

            }

        });


        radioGroup12.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton56:

                        jumlahPoint12 = 0;

                        break;

                    case R.id.RadioButton57:

                        jumlahPoint12 = 1;

                        break;

                    case R.id.RadioButton58:

                        jumlahPoint12 = 2;

                        break;

                    case R.id.RadioButton59:

                        jumlahPoint12 = 3;

                        break;

                    case R.id.RadioButton60:

                        jumlahPoint12 = 4;

                        break;

                }

            }

        });


        radioGroup13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton61:

                        jumlahPoint13 = 0;

                        break;

                    case R.id.RadioButton62:

                        jumlahPoint13 = 1;

                        break;

                    case R.id.RadioButton63:

                        jumlahPoint13 = 2;

                        break;

                    case R.id.RadioButton64:

                        jumlahPoint13 = 3;

                        break;

                    case R.id.RadioButton65:

                        jumlahPoint13 = 4;

                        break;

                }

            }

        });


        radioGroup14.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup radioGroup, int id) {

                switch (id) {

                    case R.id.RadioButton66:

                        jumlahPoint14 = 0;

                        break;

                    case R.id.RadioButton67:

                        jumlahPoint14 = 1;

                        break;

                    case R.id.RadioButton68:

                        jumlahPoint14 = 2;

                        break;

                    case R.id.RadioButton69:

                        jumlahPoint14 = 3;

                        break;

                    case R.id.RadioButton70:

                        jumlahPoint14 = 4;

                        break;

                }

            }

        });

    }

}



//TODO: untuk function pindahlagi dihapus, jika tidak digunakan

//    public void pindahlagi(View v) {
//
//        // Berpindah halaman dan mengirim nilai / data jumlah point
//
//        Intent i = new Intent(Main3Activity.this, Main4Activity.class);
//
//        i.putExtra("TOTAL_POINT", jumlahPoint);
//
//        startActivity(i);
//
//    }
//
//}
