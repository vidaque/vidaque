class mathoperation 
{ 
static float mnl (float x,float y)
  { 
  return x*y ;
  } 
static float divide (float x,float y)
  { 
  return x/y; 
  } 
} 
class mathapplication 
{ 
public void static main (string arg[]) 
  { 
float a=mathoperation .mul(4.0.5.0);
    float b=mathoperation.divide(a,2.0);
    system .out.println("b="+b);
  } 
} 
