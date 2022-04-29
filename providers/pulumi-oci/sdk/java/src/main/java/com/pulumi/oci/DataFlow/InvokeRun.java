// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataFlow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.oci.DataFlow.InvokeRunArgs;
import com.pulumi.oci.DataFlow.inputs.InvokeRunState;
import com.pulumi.oci.DataFlow.outputs.InvokeRunParameter;
import com.pulumi.oci.Utilities;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource provides the Invoke Run resource in Oracle Cloud Infrastructure Data Flow service.
 * 
 * Creates a run for an application.
 * 
 * ## Example Usage
 * ## Note
 * 
 * At a time service allows only one run to succeed if user is trying to invoke runs on multiple applications which have Private Endpoints and service will proceed invoking only one run and put the rest of them in failed state.
 * 
 * ## Import
 * 
 * InvokeRuns can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import oci:DataFlow/invokeRun:InvokeRun test_invoke_run &#34;id&#34;
 * ```
 * 
 */
@ResourceType(type="oci:DataFlow/invokeRun:InvokeRun")
public class InvokeRun extends com.pulumi.resources.CustomResource {
    /**
     * The OCID of the associated application. If this value is set, then no value for the execute parameter is required. If this value is not set, then a value for the execute parameter is required, and a new application is created and associated with the new run.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return The OCID of the associated application. If this value is set, then no value for the execute parameter is required. If this value is not set, then a value for the execute parameter is required, and a new application is created and associated with the new run.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution a Python, Java, or Scala application. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    @Export(name="archiveUri", type=String.class, parameters={})
    private Output<String> archiveUri;

    /**
     * @return An Oracle Cloud Infrastructure URI of an archive.zip file containing custom dependencies that may be used to support the execution a Python, Java, or Scala application. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    public Output<String> archiveUri() {
        return this.archiveUri;
    }
    /**
     * The arguments passed to the running application as command line arguments.  An argument is either a plain text or a placeholder. Placeholders are replaced using values from the parameters map.  Each placeholder specified must be represented in the parameters map else the request (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as `Service Api Spec`, where `name` is the name of the parameter. Example:  `[ &#34;--input&#34;, &#34;${input_file}&#34;, &#34;--name&#34;, &#34;John Doe&#34; ]` If &#34;input_file&#34; has a value of &#34;mydata.xml&#34;, then the value above will be translated to `--input mydata.xml --name &#34;John Doe&#34;`
     * 
     */
    @Export(name="arguments", type=List.class, parameters={String.class})
    private Output<List<String>> arguments;

    /**
     * @return The arguments passed to the running application as command line arguments.  An argument is either a plain text or a placeholder. Placeholders are replaced using values from the parameters map.  Each placeholder specified must be represented in the parameters map else the request (POST or PUT) will fail with a HTTP 400 status code.  Placeholders are specified as `Service Api Spec`, where `name` is the name of the parameter. Example:  `[ &#34;--input&#34;, &#34;${input_file}&#34;, &#34;--name&#34;, &#34;John Doe&#34; ]` If &#34;input_file&#34; has a value of &#34;mydata.xml&#34;, then the value above will be translated to `--input mydata.xml --name &#34;John Doe&#34;`
     * 
     */
    public Output<List<String>> arguments() {
        return this.arguments;
    }
    @Export(name="asynchronous", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> asynchronous;

    public Output<Optional<Boolean>> asynchronous() {
        return Codegen.optional(this.asynchronous);
    }
    /**
     * The class for the application.
     * 
     */
    @Export(name="className", type=String.class, parameters={})
    private Output<String> className;

    /**
     * @return The class for the application.
     * 
     */
    public Output<String> className() {
        return this.className;
    }
    /**
     * (Updatable) The OCID of a compartment.
     * 
     */
    @Export(name="compartmentId", type=String.class, parameters={})
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of a compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }
    /**
     * The Spark configuration passed to the running process. See https://spark.apache.org/docs/latest/configuration.html#available-properties Example: { &#34;spark.app.name&#34; : &#34;My App Name&#34;, &#34;spark.shuffle.io.maxRetries&#34; : &#34;4&#34; } Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is not allowed to be overwritten will cause a 400 status to be returned.
     * 
     */
    @Export(name="configuration", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> configuration;

    /**
     * @return The Spark configuration passed to the running process. See https://spark.apache.org/docs/latest/configuration.html#available-properties Example: { &#34;spark.app.name&#34; : &#34;My App Name&#34;, &#34;spark.shuffle.io.maxRetries&#34; : &#34;4&#34; } Note: Not all Spark properties are permitted to be set.  Attempting to set a property that is not allowed to be overwritten will cause a 400 status to be returned.
     * 
     */
    public Output<Map<String,Object>> configuration() {
        return this.configuration;
    }
    /**
     * The data read by the run in bytes.
     * 
     */
    @Export(name="dataReadInBytes", type=String.class, parameters={})
    private Output<String> dataReadInBytes;

    /**
     * @return The data read by the run in bytes.
     * 
     */
    public Output<String> dataReadInBytes() {
        return this.dataReadInBytes;
    }
    /**
     * The data written by the run in bytes.
     * 
     */
    @Export(name="dataWrittenInBytes", type=String.class, parameters={})
    private Output<String> dataWrittenInBytes;

    /**
     * @return The data written by the run in bytes.
     * 
     */
    public Output<String> dataWrittenInBytes() {
        return this.dataWrittenInBytes;
    }
    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Export(name="definedTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Output<Map<String,Object>> definedTags() {
        return this.definedTags;
    }
    /**
     * A user-friendly name that does not have to be unique. Avoid entering confidential information. If this value is not specified, it will be derived from the associated application&#39;s displayName or set by API using fileUri&#39;s application file name.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return A user-friendly name that does not have to be unique. Avoid entering confidential information. If this value is not specified, it will be derived from the associated application&#39;s displayName or set by API using fileUri&#39;s application file name.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     * 
     */
    @Export(name="driverShape", type=String.class, parameters={})
    private Output<String> driverShape;

    /**
     * @return The VM shape for the driver. Sets the driver cores and memory.
     * 
     */
    public Output<String> driverShape() {
        return this.driverShape;
    }
    /**
     * The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit. Supported options include ``--class``, ``--file``, ``--jars``, ``--conf``, ``--py-files``, and main application file with arguments. Example: ``--jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10`` Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit, Data Flow service will use derived information from execute input only.
     * 
     */
    @Export(name="execute", type=String.class, parameters={})
    private Output<String> execute;

    /**
     * @return The input used for spark-submit command. For more details see https://spark.apache.org/docs/latest/submitting-applications.html#launching-applications-with-spark-submit. Supported options include ``--class``, ``--file``, ``--jars``, ``--conf``, ``--py-files``, and main application file with arguments. Example: ``--jars oci://path/to/a.jar,oci://path/to/b.jar --files oci://path/to/a.json,oci://path/to/b.csv --py-files oci://path/to/a.py,oci://path/to/b.py --conf spark.sql.crossJoin.enabled=true --class org.apache.spark.examples.SparkPi oci://path/to/main.jar 10`` Note: If execute is specified together with applicationId, className, configuration, fileUri, language, arguments, parameters during application create/update, or run create/submit, Data Flow service will use derived information from execute input only.
     * 
     */
    public Output<String> execute() {
        return this.execute;
    }
    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     * 
     */
    @Export(name="executorShape", type=String.class, parameters={})
    private Output<String> executorShape;

    /**
     * @return The VM shape for the executors. Sets the executor cores and memory.
     * 
     */
    public Output<String> executorShape() {
        return this.executorShape;
    }
    /**
     * An Oracle Cloud Infrastructure URI of the file containing the application to execute. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    @Export(name="fileUri", type=String.class, parameters={})
    private Output<String> fileUri;

    /**
     * @return An Oracle Cloud Infrastructure URI of the file containing the application to execute. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    public Output<String> fileUri() {
        return this.fileUri;
    }
    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Export(name="freeformTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Output<Map<String,Object>> freeformTags() {
        return this.freeformTags;
    }
    /**
     * The Spark language.
     * 
     */
    @Export(name="language", type=String.class, parameters={})
    private Output<String> language;

    /**
     * @return The Spark language.
     * 
     */
    public Output<String> language() {
        return this.language;
    }
    /**
     * The detailed messages about the lifecycle state.
     * 
     */
    @Export(name="lifecycleDetails", type=String.class, parameters={})
    private Output<String> lifecycleDetails;

    /**
     * @return The detailed messages about the lifecycle state.
     * 
     */
    public Output<String> lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    @Export(name="logsBucketUri", type=String.class, parameters={})
    private Output<String> logsBucketUri;

    /**
     * @return An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    public Output<String> logsBucketUri() {
        return this.logsBucketUri;
    }
    /**
     * The OCID of Oracle Cloud Infrastructure Hive Metastore.
     * 
     */
    @Export(name="metastoreId", type=String.class, parameters={})
    private Output<String> metastoreId;

    /**
     * @return The OCID of Oracle Cloud Infrastructure Hive Metastore.
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * The number of executor VMs requested.
     * 
     */
    @Export(name="numExecutors", type=Integer.class, parameters={})
    private Output<Integer> numExecutors;

    /**
     * @return The number of executor VMs requested.
     * 
     */
    public Output<Integer> numExecutors() {
        return this.numExecutors;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     * 
     */
    @Export(name="opcRequestId", type=String.class, parameters={})
    private Output<String> opcRequestId;

    /**
     * @return Unique Oracle assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     * 
     */
    public Output<String> opcRequestId() {
        return this.opcRequestId;
    }
    /**
     * The OCID of the user who created the resource.
     * 
     */
    @Export(name="ownerPrincipalId", type=String.class, parameters={})
    private Output<String> ownerPrincipalId;

    /**
     * @return The OCID of the user who created the resource.
     * 
     */
    public Output<String> ownerPrincipalId() {
        return this.ownerPrincipalId;
    }
    /**
     * The username of the user who created the resource.  If the username of the owner does not exist, `null` will be returned and the caller should refer to the ownerPrincipalId value instead.
     * 
     */
    @Export(name="ownerUserName", type=String.class, parameters={})
    private Output<String> ownerUserName;

    /**
     * @return The username of the user who created the resource.  If the username of the owner does not exist, `null` will be returned and the caller should refer to the ownerPrincipalId value instead.
     * 
     */
    public Output<String> ownerUserName() {
        return this.ownerUserName;
    }
    /**
     * An array of name/value pairs used to fill placeholders found in properties like `Application.arguments`.  The name must be a string of one or more word characters (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind. Example:  [ { name: &#34;iterations&#34;, value: &#34;10&#34;}, { name: &#34;input_file&#34;, value: &#34;mydata.xml&#34; }, { name: &#34;variable_x&#34;, value: &#34;${x}&#34;} ]
     * 
     */
    @Export(name="parameters", type=List.class, parameters={InvokeRunParameter.class})
    private Output<List<InvokeRunParameter>> parameters;

    /**
     * @return An array of name/value pairs used to fill placeholders found in properties like `Application.arguments`.  The name must be a string of one or more word characters (a-z, A-Z, 0-9, _).  The value can be a string of 0 or more characters of any kind. Example:  [ { name: &#34;iterations&#34;, value: &#34;10&#34;}, { name: &#34;input_file&#34;, value: &#34;mydata.xml&#34; }, { name: &#34;variable_x&#34;, value: &#34;${x}&#34;} ]
     * 
     */
    public Output<List<InvokeRunParameter>> parameters() {
        return this.parameters;
    }
    /**
     * An array of DNS zone names. Example: `[ &#34;app.examplecorp.com&#34;, &#34;app.examplecorp2.com&#34; ]`
     * 
     */
    @Export(name="privateEndpointDnsZones", type=List.class, parameters={String.class})
    private Output<List<String>> privateEndpointDnsZones;

    /**
     * @return An array of DNS zone names. Example: `[ &#34;app.examplecorp.com&#34;, &#34;app.examplecorp2.com&#34; ]`
     * 
     */
    public Output<List<String>> privateEndpointDnsZones() {
        return this.privateEndpointDnsZones;
    }
    /**
     * The OCID of a private endpoint.
     * 
     */
    @Export(name="privateEndpointId", type=String.class, parameters={})
    private Output<String> privateEndpointId;

    /**
     * @return The OCID of a private endpoint.
     * 
     */
    public Output<String> privateEndpointId() {
        return this.privateEndpointId;
    }
    /**
     * The maximum number of hosts to be accessed through the private endpoint. This value is used to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up to 512.
     * 
     */
    @Export(name="privateEndpointMaxHostCount", type=Integer.class, parameters={})
    private Output<Integer> privateEndpointMaxHostCount;

    /**
     * @return The maximum number of hosts to be accessed through the private endpoint. This value is used to calculate the relevant CIDR block and should be a multiple of 256.  If the value is not a multiple of 256, it is rounded up to the next multiple of 256. For example, 300 is rounded up to 512.
     * 
     */
    public Output<Integer> privateEndpointMaxHostCount() {
        return this.privateEndpointMaxHostCount;
    }
    /**
     * An array of network security group OCIDs.
     * 
     */
    @Export(name="privateEndpointNsgIds", type=List.class, parameters={String.class})
    private Output<List<String>> privateEndpointNsgIds;

    /**
     * @return An array of network security group OCIDs.
     * 
     */
    public Output<List<String>> privateEndpointNsgIds() {
        return this.privateEndpointNsgIds;
    }
    /**
     * The OCID of a subnet.
     * 
     */
    @Export(name="privateEndpointSubnetId", type=String.class, parameters={})
    private Output<String> privateEndpointSubnetId;

    /**
     * @return The OCID of a subnet.
     * 
     */
    public Output<String> privateEndpointSubnetId() {
        return this.privateEndpointSubnetId;
    }
    /**
     * The duration of the run in milliseconds.
     * 
     */
    @Export(name="runDurationInMilliseconds", type=String.class, parameters={})
    private Output<String> runDurationInMilliseconds;

    /**
     * @return The duration of the run in milliseconds.
     * 
     */
    public Output<String> runDurationInMilliseconds() {
        return this.runDurationInMilliseconds;
    }
    /**
     * The Spark version utilized to run the application. This value may be set if applicationId is not since the Spark version will be taken from the associated application.
     * 
     */
    @Export(name="sparkVersion", type=String.class, parameters={})
    private Output<String> sparkVersion;

    /**
     * @return The Spark version utilized to run the application. This value may be set if applicationId is not since the Spark version will be taken from the associated application.
     * 
     */
    public Output<String> sparkVersion() {
        return this.sparkVersion;
    }
    /**
     * The current state of this run.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return The current state of this run.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The date and time a application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2018-04-03T21:10:29.600Z`
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The date and time a application was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2018-04-03T21:10:29.600Z`
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * The date and time a application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2018-04-03T21:10:29.600Z`
     * 
     */
    @Export(name="timeUpdated", type=String.class, parameters={})
    private Output<String> timeUpdated;

    /**
     * @return The date and time a application was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: `2018-04-03T21:10:29.600Z`
     * 
     */
    public Output<String> timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * The total number of oCPU requested by the run.
     * 
     */
    @Export(name="totalOcpu", type=Integer.class, parameters={})
    private Output<Integer> totalOcpu;

    /**
     * @return The total number of oCPU requested by the run.
     * 
     */
    public Output<Integer> totalOcpu() {
        return this.totalOcpu;
    }
    /**
     * The Spark application processing type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The Spark application processing type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory for BATCH SQL runs. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    @Export(name="warehouseBucketUri", type=String.class, parameters={})
    private Output<String> warehouseBucketUri;

    /**
     * @return An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory for BATCH SQL runs. See https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/hdfsconnector.htm#uriformat.
     * 
     */
    public Output<String> warehouseBucketUri() {
        return this.warehouseBucketUri;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InvokeRun(String name) {
        this(name, InvokeRunArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InvokeRun(String name, InvokeRunArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InvokeRun(String name, InvokeRunArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataFlow/invokeRun:InvokeRun", name, args == null ? InvokeRunArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InvokeRun(String name, Output<String> id, @Nullable InvokeRunState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("oci:DataFlow/invokeRun:InvokeRun", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InvokeRun get(String name, Output<String> id, @Nullable InvokeRunState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InvokeRun(name, id, state, options);
    }
}
