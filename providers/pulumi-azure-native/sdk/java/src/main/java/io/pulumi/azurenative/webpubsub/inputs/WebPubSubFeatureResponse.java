// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebPubSubFeatureResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebPubSubFeatureResponse Empty = new WebPubSubFeatureResponse();

    @InputImport(name="flag", required=true)
    private final String flag;

    public String getFlag() {
        return this.flag;
    }

    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    @InputImport(name="value", required=true)
    private final String value;

    public String getValue() {
        return this.value;
    }

    public WebPubSubFeatureResponse(
        String flag,
        @Nullable Map<String,String> properties,
        String value) {
        this.flag = Objects.requireNonNull(flag, "expected parameter 'flag' to be non-null");
        this.properties = properties;
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private WebPubSubFeatureResponse() {
        this.flag = null;
        this.properties = Map.of();
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebPubSubFeatureResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String flag;
        private @Nullable Map<String,String> properties;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebPubSubFeatureResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flag = defaults.flag;
    	      this.properties = defaults.properties;
    	      this.value = defaults.value;
        }

        public Builder setFlag(String flag) {
            this.flag = Objects.requireNonNull(flag);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public WebPubSubFeatureResponse build() {
            return new WebPubSubFeatureResponse(flag, properties, value);
        }
    }
}
