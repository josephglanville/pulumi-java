// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The RosettaNet ProcessConfiguration business document settings.
 * 
 */
public final class RosettaNetPipBusinessDocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RosettaNetPipBusinessDocumentArgs Empty = new RosettaNetPipBusinessDocumentArgs();

    /**
     * The business document description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The business document name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The business document version.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public RosettaNetPipBusinessDocumentArgs(
        @Nullable Output<String> description,
        Output<String> name,
        Output<String> version) {
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private RosettaNetPipBusinessDocumentArgs() {
        this.description = Output.empty();
        this.name = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RosettaNetPipBusinessDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> name;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(RosettaNetPipBusinessDocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public RosettaNetPipBusinessDocumentArgs build() {
            return new RosettaNetPipBusinessDocumentArgs(description, name, version);
        }
    }
}
