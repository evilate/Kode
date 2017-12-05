// Test toasts
 // Handler which will run after 2 seconds.
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                      Toast.makeText(MathsGameResults.this,
                                "Data is successfully uploaded.",
                                Toast.LENGTH_LONG).show();
                }
            }, 2000);
