// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebPubSubFeatureResponse {
    private final String flag;
    private final @Nullable Map<String,String> properties;
    private final String value;

    @OutputCustomType.Constructor({"flag","properties","value"})
    private WebPubSubFeatureResponse(
        String flag,
        @Nullable Map<String,String> properties,
        String value) {
        this.flag = Objects.requireNonNull(flag);
        this.properties = properties;
        this.value = Objects.requireNonNull(value);
    }

    public String getFlag() {
        return this.flag;
    }
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    public String getValue() {
        return this.value;
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
