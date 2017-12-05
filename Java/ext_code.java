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

final Handler handler = new Handler();
b1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
     handler.postDelayed(new Runnable() {
        @Override
        public void run() {
  Toast.makeText(MainActivity.this,"Welcome to my first project in android",Toast.LENGTH_LONG).show();

}, 20000); //in milliseconds

}); 
