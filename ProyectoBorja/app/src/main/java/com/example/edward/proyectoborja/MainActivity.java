package com.example.edward.proyectoborja;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ListView lista;
    private ArrayAdapter<String> adaptador;
    String[] datos= {"Martin garrix-Virus", "Rolling stones-Start me up", "ACDC- Thunderstruck", "Cancion externa","Video sobre los servidores"};
    private MediaRecorder recorder;
    private String filename;
    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InicializacionControles();
        lista.setAdapter(adaptador);


       // videoView.setVideoURI(Uri.parse("android.resource://" +
               // getPackageName() + "/" + R.raw.movie));




    }




    private void InicializacionControles() {
        // TODO Auto-generated method stub
        lista = (ListView) findViewById(R.id.ListView01);
        adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, datos);


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {
                String value = (String) adapter.getItemAtPosition(position);

                if (value.equals("Martin garrix-Virus")) {
                    Toast.makeText(getApplicationContext(), "Martin garrix-Virus", Toast.LENGTH_SHORT).show();
                    filename = Environment.getExternalStorageDirectory().getAbsolutePath() + "/garrix.mp3";
                    final MediaPlayer player = new MediaPlayer();
                    try {
                        player.setDataSource(filename);
                        player.prepare();
                        player.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    final ImageView btPlay = (ImageView) findViewById(R.id.btPlay);
                    btPlay.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (!player.isPlaying()) {
                                    player.start();
                                    Toast.makeText(getApplicationContext(), "Reproduciendo", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });

                    final ImageView btPause = (ImageView) findViewById(R.id.btPause);
                    btPause.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying()) {
                                    player.pause();
                                    Toast.makeText(getApplicationContext(), "Pausa", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });


                    final ImageView btStop = (ImageView) findViewById(R.id.btStop);
                    btStop.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying() || !player.isPlaying()) {
                                    player.stop();
                                    Toast.makeText(getApplicationContext(), "Detenido", Toast.LENGTH_SHORT).show();


                                }


                            } catch (Exception e) {
                            }


                        }
                    });


                } else if (value.equals("Rolling stones-Start me up")) {
                    Toast.makeText(getApplicationContext(), "Rolling stones-Start me up", Toast.LENGTH_SHORT).show();

                    filename = Environment.getExternalStorageDirectory().getAbsolutePath() + "/startmeup.mp3";
                    final MediaPlayer player = new MediaPlayer();
                    try {
                        player.setDataSource(filename);
                        player.prepare();
                        player.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    final ImageView btPlay = (ImageView) findViewById(R.id.btPlay);
                    btPlay.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (!player.isPlaying()) {
                                    player.start();
                                    Toast.makeText(getApplicationContext(), "Reproduciendo", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });

                    final ImageView btPause = (ImageView) findViewById(R.id.btPause);
                    btPause.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying()) {
                                    player.pause();
                                    Toast.makeText(getApplicationContext(), "Pausa", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });


                    final ImageView btStop = (ImageView) findViewById(R.id.btStop);
                    btStop.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying() || !player.isPlaying()) {
                                    player.stop();
                                    Toast.makeText(getApplicationContext(), "Detenido", Toast.LENGTH_SHORT).show();


                                }


                            } catch (Exception e) {
                            }


                        }
                    });


                } else if (value.equals("ACDC- Thunderstruck")) {
                    Toast.makeText(getApplicationContext(), "ACDC- Thunderstruck", Toast.LENGTH_SHORT).show();
                    filename = Environment.getExternalStorageDirectory().getAbsolutePath() + "/tunder.mp3";
                    final MediaPlayer player = new MediaPlayer();
                    try {
                        player.setDataSource(filename);
                        player.prepare();
                        player.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    final ImageView btPlay = (ImageView) findViewById(R.id.btPlay);
                    btPlay.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (!player.isPlaying()) {
                                    player.start();
                                    Toast.makeText(getApplicationContext(), "Reproduciendo", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });

                    final ImageView btPause = (ImageView) findViewById(R.id.btPause);
                    btPause.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying()) {
                                    player.pause();
                                    Toast.makeText(getApplicationContext(), "Pausa", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });


                    final ImageView btStop = (ImageView) findViewById(R.id.btStop);
                    btStop.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying() || !player.isPlaying()) {
                                    player.stop();
                                    Toast.makeText(getApplicationContext(), "Detenido", Toast.LENGTH_SHORT).show();


                                }


                            } catch (Exception e) {
                            }


                        }
                    });


                } else if (value.equals("Cancion externa")) {
                    Toast.makeText(getApplicationContext(), "Cancion externa", Toast.LENGTH_SHORT).show();
                    final MediaPlayer player = new MediaPlayer();

                    try {
                        String url = "http://media.w3.org/2010/07/bunny/04-Death_Becomes_Fur.oga"; // your URL here

                        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
                        player.setDataSource(url);
                        player.prepare(); // might take long! (for buffering, etc)
                        player.start();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    final ImageView btPlay = (ImageView) findViewById(R.id.btPlay);
                    btPlay.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (!player.isPlaying()) {
                                    player.start();
                                    Toast.makeText(getApplicationContext(), "Reproduciendo", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });

                    final ImageView btPause = (ImageView) findViewById(R.id.btPause);
                    btPause.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying()) {
                                    player.pause();
                                    Toast.makeText(getApplicationContext(), "Pausa", Toast.LENGTH_SHORT).show();
                                }


                            } catch (Exception e) {
                            }


                        }
                    });


                    final ImageView btStop = (ImageView) findViewById(R.id.btStop);
                    btStop.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {

                            try {

                                if (player.isPlaying() || !player.isPlaying()) {
                                    player.stop();
                                    Toast.makeText(getApplicationContext(), "Detenido", Toast.LENGTH_SHORT).show();


                                }


                            } catch (Exception e) {
                            }


                        }
                    });

                } else if (value.equals("Video sobre los servidores")) {
                    Toast.makeText(getApplicationContext(), "Video sobre los servidores", Toast.LENGTH_SHORT).show();
                    Intent abrevideo = new Intent(MainActivity.this,Video.class);
                    startActivity(abrevideo);

                }

            }
        });






    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
