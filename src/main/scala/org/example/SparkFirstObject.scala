import org.apache.spark.sql.SparkSession

object SparkFirstObject extends App {
  val spark=SparkSession.builder.master("local[*]").getOrCreate
  val df=spark.range(1,10)
  df.printSchema()
  df.show(false)
}