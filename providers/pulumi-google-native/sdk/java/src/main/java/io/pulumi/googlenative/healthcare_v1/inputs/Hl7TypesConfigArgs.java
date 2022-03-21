// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.healthcare_v1.inputs.TypeArgs;
import io.pulumi.googlenative.healthcare_v1.inputs.VersionSourceArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Root config for HL7v2 datatype definitions for a specific HL7v2 version.
 * 
 */
public final class Hl7TypesConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7TypesConfigArgs Empty = new Hl7TypesConfigArgs();

    /**
     * The HL7v2 type definitions.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<List<TypeArgs>> type;

    public Output<List<TypeArgs>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The version selectors that this config applies to. A message must match ALL version sources to apply.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<List<VersionSourceArgs>> version;

    public Output<List<VersionSourceArgs>> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public Hl7TypesConfigArgs(
        @Nullable Output<List<TypeArgs>> type,
        @Nullable Output<List<VersionSourceArgs>> version) {
        this.type = type;
        this.version = version;
    }

    private Hl7TypesConfigArgs() {
        this.type = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7TypesConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TypeArgs>> type;
        private @Nullable Output<List<VersionSourceArgs>> version;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7TypesConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder type(@Nullable Output<List<TypeArgs>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable List<TypeArgs> type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public Builder type(TypeArgs... type) {
            return type(List.of(type));
        }
        public Builder version(@Nullable Output<List<VersionSourceArgs>> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable List<VersionSourceArgs> version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public Builder version(VersionSourceArgs... version) {
            return version(List.of(version));
        }        public Hl7TypesConfigArgs build() {
            return new Hl7TypesConfigArgs(type, version);
        }
    }
}
