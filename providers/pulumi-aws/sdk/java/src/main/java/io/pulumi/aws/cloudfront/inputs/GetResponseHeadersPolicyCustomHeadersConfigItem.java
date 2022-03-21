// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetResponseHeadersPolicyCustomHeadersConfigItem extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicyCustomHeadersConfigItem Empty = new GetResponseHeadersPolicyCustomHeadersConfigItem();

    /**
     * The HTTP response header name.
     * 
     */
    @Import(name="header", required=true)
      private final String header;

    public String getHeader() {
        return this.header;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    /**
     * The value for the HTTP response header.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String getValue() {
        return this.value;
    }

    public GetResponseHeadersPolicyCustomHeadersConfigItem(
        String header,
        Boolean override,
        String value) {
        this.header = Objects.requireNonNull(header, "expected parameter 'header' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private GetResponseHeadersPolicyCustomHeadersConfigItem() {
        this.header = null;
        this.override = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicyCustomHeadersConfigItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String header;
        private Boolean override;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicyCustomHeadersConfigItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.override = defaults.override;
    	      this.value = defaults.value;
        }

        public Builder header(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public GetResponseHeadersPolicyCustomHeadersConfigItem build() {
            return new GetResponseHeadersPolicyCustomHeadersConfigItem(header, override, value);
        }
    }
}
