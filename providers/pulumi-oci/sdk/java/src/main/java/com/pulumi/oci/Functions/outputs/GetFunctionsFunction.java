// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Functions.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Functions.outputs.GetFunctionsFunctionTraceConfig;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetFunctionsFunction {
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application to which this function belongs.
     * 
     */
    private final String applicationId;
    /**
     * @return The OCID of the compartment that contains the function.
     * 
     */
    private final String compartmentId;
    /**
     * @return Function configuration. Overrides application configuration. Keys must be ASCII strings consisting solely of letters, digits, and the &#39;_&#39; (underscore) character, and must not begin with a digit. Values should be limited to printable unicode characters.  Example: `{&#34;MY_FUNCTION_CONFIG&#34;: &#34;ConfVal&#34;}`
     * 
     */
    private final Map<String,Object> config;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return A filter to return only functions with display names that match the display name string. Matching is exact.
     * 
     */
    private final String displayName;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return A filter to return only functions with the specified OCID.
     * 
     */
    private final String id;
    /**
     * @return The qualified name of the Docker image to use in the function, including the image tag. The image should be in the Oracle Cloud Infrastructure Registry that is in the same region as the function itself. Example: `phx.ocir.io/ten/functions/function:0.0.1`
     * 
     */
    private final String image;
    /**
     * @return The image digest for the version of the image that will be pulled when invoking this function. If no value is specified, the digest currently associated with the image in the Oracle Cloud Infrastructure Registry will be used. Example: `sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7`
     * 
     */
    private final String imageDigest;
    /**
     * @return The base https invoke URL to set on a client in order to invoke a function. This URL will never change over the lifetime of the function and can be cached.
     * 
     */
    private final String invokeEndpoint;
    /**
     * @return Maximum usable memory for the function (MiB).
     * 
     */
    private final String memoryInMbs;
    /**
     * @return A filter to return only functions that match the lifecycle state in this parameter. Example: `Creating`
     * 
     */
    private final String state;
    /**
     * @return The time the function was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2018-09-12T22:47:12.613Z`
     * 
     */
    private final String timeCreated;
    /**
     * @return The time the function was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2018-09-12T22:47:12.613Z`
     * 
     */
    private final String timeUpdated;
    /**
     * @return Timeout for executions of the function. Value in seconds.
     * 
     */
    private final Integer timeoutInSeconds;
    /**
     * @return Define the tracing configuration for a function.
     * 
     */
    private final List<GetFunctionsFunctionTraceConfig> traceConfigs;

    @CustomType.Constructor
    private GetFunctionsFunction(
        @CustomType.Parameter("applicationId") String applicationId,
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("config") Map<String,Object> config,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("image") String image,
        @CustomType.Parameter("imageDigest") String imageDigest,
        @CustomType.Parameter("invokeEndpoint") String invokeEndpoint,
        @CustomType.Parameter("memoryInMbs") String memoryInMbs,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated,
        @CustomType.Parameter("timeoutInSeconds") Integer timeoutInSeconds,
        @CustomType.Parameter("traceConfigs") List<GetFunctionsFunctionTraceConfig> traceConfigs) {
        this.applicationId = applicationId;
        this.compartmentId = compartmentId;
        this.config = config;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.id = id;
        this.image = image;
        this.imageDigest = imageDigest;
        this.invokeEndpoint = invokeEndpoint;
        this.memoryInMbs = memoryInMbs;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeoutInSeconds = timeoutInSeconds;
        this.traceConfigs = traceConfigs;
    }

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the application to which this function belongs.
     * 
     */
    public String applicationId() {
        return this.applicationId;
    }
    /**
     * @return The OCID of the compartment that contains the function.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Function configuration. Overrides application configuration. Keys must be ASCII strings consisting solely of letters, digits, and the &#39;_&#39; (underscore) character, and must not begin with a digit. Values should be limited to printable unicode characters.  Example: `{&#34;MY_FUNCTION_CONFIG&#34;: &#34;ConfVal&#34;}`
     * 
     */
    public Map<String,Object> config() {
        return this.config;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return A filter to return only functions with display names that match the display name string. Matching is exact.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return A filter to return only functions with the specified OCID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The qualified name of the Docker image to use in the function, including the image tag. The image should be in the Oracle Cloud Infrastructure Registry that is in the same region as the function itself. Example: `phx.ocir.io/ten/functions/function:0.0.1`
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return The image digest for the version of the image that will be pulled when invoking this function. If no value is specified, the digest currently associated with the image in the Oracle Cloud Infrastructure Registry will be used. Example: `sha256:ca0eeb6fb05351dfc8759c20733c91def84cb8007aa89a5bf606bc8b315b9fc7`
     * 
     */
    public String imageDigest() {
        return this.imageDigest;
    }
    /**
     * @return The base https invoke URL to set on a client in order to invoke a function. This URL will never change over the lifetime of the function and can be cached.
     * 
     */
    public String invokeEndpoint() {
        return this.invokeEndpoint;
    }
    /**
     * @return Maximum usable memory for the function (MiB).
     * 
     */
    public String memoryInMbs() {
        return this.memoryInMbs;
    }
    /**
     * @return A filter to return only functions that match the lifecycle state in this parameter. Example: `Creating`
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The time the function was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2018-09-12T22:47:12.613Z`
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The time the function was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.  Example: `2018-09-12T22:47:12.613Z`
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }
    /**
     * @return Timeout for executions of the function. Value in seconds.
     * 
     */
    public Integer timeoutInSeconds() {
        return this.timeoutInSeconds;
    }
    /**
     * @return Define the tracing configuration for a function.
     * 
     */
    public List<GetFunctionsFunctionTraceConfig> traceConfigs() {
        return this.traceConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionsFunction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationId;
        private String compartmentId;
        private Map<String,Object> config;
        private Map<String,Object> definedTags;
        private String displayName;
        private Map<String,Object> freeformTags;
        private String id;
        private String image;
        private String imageDigest;
        private String invokeEndpoint;
        private String memoryInMbs;
        private String state;
        private String timeCreated;
        private String timeUpdated;
        private Integer timeoutInSeconds;
        private List<GetFunctionsFunctionTraceConfig> traceConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionsFunction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.compartmentId = defaults.compartmentId;
    	      this.config = defaults.config;
    	      this.definedTags = defaults.definedTags;
    	      this.displayName = defaults.displayName;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.image = defaults.image;
    	      this.imageDigest = defaults.imageDigest;
    	      this.invokeEndpoint = defaults.invokeEndpoint;
    	      this.memoryInMbs = defaults.memoryInMbs;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.traceConfigs = defaults.traceConfigs;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder config(Map<String,Object> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder imageDigest(String imageDigest) {
            this.imageDigest = Objects.requireNonNull(imageDigest);
            return this;
        }
        public Builder invokeEndpoint(String invokeEndpoint) {
            this.invokeEndpoint = Objects.requireNonNull(invokeEndpoint);
            return this;
        }
        public Builder memoryInMbs(String memoryInMbs) {
            this.memoryInMbs = Objects.requireNonNull(memoryInMbs);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = Objects.requireNonNull(timeoutInSeconds);
            return this;
        }
        public Builder traceConfigs(List<GetFunctionsFunctionTraceConfig> traceConfigs) {
            this.traceConfigs = Objects.requireNonNull(traceConfigs);
            return this;
        }
        public Builder traceConfigs(GetFunctionsFunctionTraceConfig... traceConfigs) {
            return traceConfigs(List.of(traceConfigs));
        }        public GetFunctionsFunction build() {
            return new GetFunctionsFunction(applicationId, compartmentId, config, definedTags, displayName, freeformTags, id, image, imageDigest, invokeEndpoint, memoryInMbs, state, timeCreated, timeUpdated, timeoutInSeconds, traceConfigs);
        }
    }
}
