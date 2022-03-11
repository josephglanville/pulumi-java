// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PipelineDatastoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDatastoreArgs Empty = new PipelineDatastoreArgs();

    @InputImport(name="datastoreName", required=true)
      private final Output<String> datastoreName;

    public Output<String> getDatastoreName() {
        return this.datastoreName;
    }

    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public PipelineDatastoreArgs(
        Output<String> datastoreName,
        Output<String> name) {
        this.datastoreName = Objects.requireNonNull(datastoreName, "expected parameter 'datastoreName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PipelineDatastoreArgs() {
        this.datastoreName = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDatastoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datastoreName;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDatastoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreName = defaults.datastoreName;
    	      this.name = defaults.name;
        }

        public Builder datastoreName(Output<String> datastoreName) {
            this.datastoreName = Objects.requireNonNull(datastoreName);
            return this;
        }

        public Builder datastoreName(String datastoreName) {
            this.datastoreName = Output.of(Objects.requireNonNull(datastoreName));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public PipelineDatastoreArgs build() {
            return new PipelineDatastoreArgs(datastoreName, name);
        }
    }
}
