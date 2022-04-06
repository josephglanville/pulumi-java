// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetLaunchConfigurationMetadataOption {
    /**
     * The state of the metadata service: `enabled`, `disabled`.
     * 
     */
    private final String httpEndpoint;
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * 
     */
    private final Integer httpPutResponseHopLimit;
    /**
     * If session tokens are required: `optional`, `required`.
     * 
     */
    private final String httpTokens;

    @CustomType.Constructor
    private GetLaunchConfigurationMetadataOption(
        @CustomType.Parameter("httpEndpoint") String httpEndpoint,
        @CustomType.Parameter("httpPutResponseHopLimit") Integer httpPutResponseHopLimit,
        @CustomType.Parameter("httpTokens") String httpTokens) {
        this.httpEndpoint = httpEndpoint;
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        this.httpTokens = httpTokens;
    }

    /**
     * The state of the metadata service: `enabled`, `disabled`.
     * 
    */
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }
    /**
     * The desired HTTP PUT response hop limit for instance metadata requests.
     * 
    */
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }
    /**
     * If session tokens are required: `optional`, `required`.
     * 
    */
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchConfigurationMetadataOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpEndpoint;
        private Integer httpPutResponseHopLimit;
        private String httpTokens;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchConfigurationMetadataOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpEndpoint = defaults.httpEndpoint;
    	      this.httpPutResponseHopLimit = defaults.httpPutResponseHopLimit;
    	      this.httpTokens = defaults.httpTokens;
        }

        public Builder httpEndpoint(String httpEndpoint) {
            this.httpEndpoint = Objects.requireNonNull(httpEndpoint);
            return this;
        }
        public Builder httpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
            this.httpPutResponseHopLimit = Objects.requireNonNull(httpPutResponseHopLimit);
            return this;
        }
        public Builder httpTokens(String httpTokens) {
            this.httpTokens = Objects.requireNonNull(httpTokens);
            return this;
        }        public GetLaunchConfigurationMetadataOption build() {
            return new GetLaunchConfigurationMetadataOption(httpEndpoint, httpPutResponseHopLimit, httpTokens);
        }
    }
}