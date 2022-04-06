// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.SecretLabelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretArgs Empty = new SecretArgs();

    /**
     * Base64-url-safe-encoded secret data
     * 
     */
    @Import(name="data", required=true)
      private final Output<String> data;

    public Output<String> getData() {
        return this.data;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<SecretLabelArgs>> labels;

    public Output<List<SecretLabelArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * User-defined name of the secret
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public SecretArgs(
        Output<String> data,
        @Nullable Output<List<SecretLabelArgs>> labels,
        @Nullable Output<String> name) {
        this.data = Objects.requireNonNull(data, "expected parameter 'data' to be non-null");
        this.labels = labels;
        this.name = name;
    }

    private SecretArgs() {
        this.data = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> data;
        private @Nullable Output<List<SecretLabelArgs>> labels;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.data = defaults.data;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder data(Output<String> data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }
        public Builder data(String data) {
            this.data = Output.of(Objects.requireNonNull(data));
            return this;
        }
        public Builder labels(@Nullable Output<List<SecretLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<SecretLabelArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(SecretLabelArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public SecretArgs build() {
            return new SecretArgs(data, labels, name);
        }
    }
}