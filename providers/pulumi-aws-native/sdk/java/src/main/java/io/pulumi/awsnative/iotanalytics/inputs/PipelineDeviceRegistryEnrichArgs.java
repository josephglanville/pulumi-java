// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineDeviceRegistryEnrichArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineDeviceRegistryEnrichArgs Empty = new PipelineDeviceRegistryEnrichArgs();

    @Import(name="attribute", required=true)
      private final Output<String> attribute;

    public Output<String> getAttribute() {
        return this.attribute;
    }

    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @Import(name="next")
      private final @Nullable Output<String> next;

    public Output<String> getNext() {
        return this.next == null ? Output.empty() : this.next;
    }

    @Import(name="roleArn", required=true)
      private final Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn;
    }

    @Import(name="thingName", required=true)
      private final Output<String> thingName;

    public Output<String> getThingName() {
        return this.thingName;
    }

    public PipelineDeviceRegistryEnrichArgs(
        Output<String> attribute,
        Output<String> name,
        @Nullable Output<String> next,
        Output<String> roleArn,
        Output<String> thingName) {
        this.attribute = Objects.requireNonNull(attribute, "expected parameter 'attribute' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.next = next;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.thingName = Objects.requireNonNull(thingName, "expected parameter 'thingName' to be non-null");
    }

    private PipelineDeviceRegistryEnrichArgs() {
        this.attribute = Output.empty();
        this.name = Output.empty();
        this.next = Output.empty();
        this.roleArn = Output.empty();
        this.thingName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineDeviceRegistryEnrichArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> attribute;
        private Output<String> name;
        private @Nullable Output<String> next;
        private Output<String> roleArn;
        private Output<String> thingName;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineDeviceRegistryEnrichArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attribute = defaults.attribute;
    	      this.name = defaults.name;
    	      this.next = defaults.next;
    	      this.roleArn = defaults.roleArn;
    	      this.thingName = defaults.thingName;
        }

        public Builder attribute(Output<String> attribute) {
            this.attribute = Objects.requireNonNull(attribute);
            return this;
        }
        public Builder attribute(String attribute) {
            this.attribute = Output.of(Objects.requireNonNull(attribute));
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
        public Builder next(@Nullable Output<String> next) {
            this.next = next;
            return this;
        }
        public Builder next(@Nullable String next) {
            this.next = Output.ofNullable(next);
            return this;
        }
        public Builder roleArn(Output<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Output.of(Objects.requireNonNull(roleArn));
            return this;
        }
        public Builder thingName(Output<String> thingName) {
            this.thingName = Objects.requireNonNull(thingName);
            return this;
        }
        public Builder thingName(String thingName) {
            this.thingName = Output.of(Objects.requireNonNull(thingName));
            return this;
        }        public PipelineDeviceRegistryEnrichArgs build() {
            return new PipelineDeviceRegistryEnrichArgs(attribute, name, next, roleArn, thingName);
        }
    }
}
