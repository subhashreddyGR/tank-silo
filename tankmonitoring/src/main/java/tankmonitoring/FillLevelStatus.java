package tankmonitoring;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FillLevelStatus implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String tankType;
   private java.lang.Double reading;
   private java.lang.String alert;
   private java.lang.String status;
   private java.lang.String notificationMethod;
   private java.lang.String color;

   public FillLevelStatus()
   {
   }

   public java.lang.String getTankType()
   {
      return this.tankType;
   }

   public void setTankType(java.lang.String tankType)
   {
      this.tankType = tankType;
   }

   public java.lang.Double getReading()
   {
      return this.reading;
   }

   public void setReading(java.lang.Double reading)
   {
      this.reading = reading;
   }

   public java.lang.String getAlert()
   {
      return this.alert;
   }

   public void setAlert(java.lang.String alert)
   {
      this.alert = alert;
   }

   public java.lang.String getStatus()
   {
      return this.status;
   }

   public void setStatus(java.lang.String status)
   {
      this.status = status;
   }

   public java.lang.String getNotificationMethod()
   {
      return this.notificationMethod;
   }

   public void setNotificationMethod(java.lang.String notificationMethod)
   {
      this.notificationMethod = notificationMethod;
   }

   public java.lang.String getColor()
   {
      return this.color;
   }

   public void setColor(java.lang.String color)
   {
      this.color = color;
   }

   public FillLevelStatus(java.lang.String tankType, java.lang.Double reading,
         java.lang.String alert, java.lang.String status,
         java.lang.String notificationMethod, java.lang.String color)
   {
      this.tankType = tankType;
      this.reading = reading;
      this.alert = alert;
      this.status = status;
      this.notificationMethod = notificationMethod;
      this.color = color;
   }

}