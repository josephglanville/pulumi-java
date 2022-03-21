// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpHeaderOptionResponse {
    /**
     * The name of the header.
     * 
     */
    private final String headerName;
    /**
     * The value of the header to add.
     * 
     */
    private final String headerValue;
    /**
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * 
     */
    private final Boolean replace;

    @CustomType.Constructor
    private HttpHeaderOptionResponse(
        @CustomType.Parameter("headerName") String headerName,
        @CustomType.Parameter("headerValue") String headerValue,
        @CustomType.Parameter("replace") Boolean replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    /**
     * The name of the header.
     * 
    */
    public String getHeaderName() {
        return this.headerName;
    }
    /**
     * The value of the header to add.
     * 
    */
    public String getHeaderValue() {
        return this.headerValue;
    }
    /**
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * 
    */
    public Boolean getReplace() {
        return this.replace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderOptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerName;
        private String headerValue;
        private Boolean replace;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderOptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerValue(String headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }
        public Builder replace(Boolean replace) {
            this.replace = Objects.requireNonNull(replace);
            return this;
        }        public HttpHeaderOptionResponse build() {
            return new HttpHeaderOptionResponse(headerName, headerValue, replace);
        }
    }
}
