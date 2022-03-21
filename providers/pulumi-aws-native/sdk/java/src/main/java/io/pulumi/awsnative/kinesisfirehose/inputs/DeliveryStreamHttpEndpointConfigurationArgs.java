// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamHttpEndpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamHttpEndpointConfigurationArgs Empty = new DeliveryStreamHttpEndpointConfigurationArgs();

    @Import(name="accessKey")
      private final @Nullable Output<String> accessKey;

    public Output<String> getAccessKey() {
        return this.accessKey == null ? Output.empty() : this.accessKey;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    public DeliveryStreamHttpEndpointConfigurationArgs(
        @Nullable Output<String> accessKey,
        @Nullable Output<String> name,
        Output<String> url) {
        this.accessKey = accessKey;
        this.name = name;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DeliveryStreamHttpEndpointConfigurationArgs() {
        this.accessKey = Output.empty();
        this.name = Output.empty();
        this.url = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessKey;
        private @Nullable Output<String> name;
        private Output<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder accessKey(@Nullable Output<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public Builder accessKey(@Nullable String accessKey) {
            this.accessKey = Output.ofNullable(accessKey);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }        public DeliveryStreamHttpEndpointConfigurationArgs build() {
            return new DeliveryStreamHttpEndpointConfigurationArgs(accessKey, name, url);
        }
    }
}
