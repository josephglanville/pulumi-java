// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsupport_v2beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A classification object with a product type and value.
 * 
 */
public final class CaseClassificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaseClassificationArgs Empty = new CaseClassificationArgs();

    /**
     * The display name of the classification.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * The unique ID for a classification. Must be specified for case creation.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    public CaseClassificationArgs(
        @Nullable Output<String> displayName,
        @Nullable Output<String> id) {
        this.displayName = displayName;
        this.id = id;
    }

    private CaseClassificationArgs() {
        this.displayName = Output.empty();
        this.id = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaseClassificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> displayName;
        private @Nullable Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(CaseClassificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }        public CaseClassificationArgs build() {
            return new CaseClassificationArgs(displayName, id);
        }
    }
}
