// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.diagflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CxVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CxVersionArgs Empty = new CxVersionArgs();

    /**
     * The description of the version. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The human-readable name of the version. Limit of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * The Flow to create an Version for.
     * Format: projects/<Project ID>/locations/<Location ID>/agents/<Agent ID>/flows/<Flow ID>.
     * 
     */
    @Import(name="parent")
      private final @Nullable Output<String> parent;

    public Output<String> getParent() {
        return this.parent == null ? Output.empty() : this.parent;
    }

    public CxVersionArgs(
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<String> parent) {
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.parent = parent;
    }

    private CxVersionArgs() {
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.parent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<String> parent;

        public Builder() {
    	      // Empty
        }

        public Builder(CxVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.parent = defaults.parent;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder parent(@Nullable Output<String> parent) {
            this.parent = parent;
            return this;
        }
        public Builder parent(@Nullable String parent) {
            this.parent = Output.ofNullable(parent);
            return this;
        }        public CxVersionArgs build() {
            return new CxVersionArgs(description, displayName, parent);
        }
    }
}
