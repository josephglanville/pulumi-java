// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ListVideoStreamingTokenResult {
    /**
     * The streaming token expiration date in ISO8601 format (eg. 2021-01-01T00:00:00Z).
     * 
     */
    private final String expirationDate;
    /**
     * The streaming token value to be added to the video streaming URL as the value for a "token" query string parameter. The token is specific to a single video.
     * 
     */
    private final String token;

    @CustomType.Constructor
    private ListVideoStreamingTokenResult(
        @CustomType.Parameter("expirationDate") String expirationDate,
        @CustomType.Parameter("token") String token) {
        this.expirationDate = expirationDate;
        this.token = token;
    }

    /**
     * The streaming token expiration date in ISO8601 format (eg. 2021-01-01T00:00:00Z).
     * 
    */
    public String getExpirationDate() {
        return this.expirationDate;
    }
    /**
     * The streaming token value to be added to the video streaming URL as the value for a "token" query string parameter. The token is specific to a single video.
     * 
    */
    public String getToken() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListVideoStreamingTokenResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationDate;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(ListVideoStreamingTokenResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationDate = defaults.expirationDate;
    	      this.token = defaults.token;
        }

        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }        public ListVideoStreamingTokenResult build() {
            return new ListVideoStreamingTokenResult(expirationDate, token);
        }
    }
}
