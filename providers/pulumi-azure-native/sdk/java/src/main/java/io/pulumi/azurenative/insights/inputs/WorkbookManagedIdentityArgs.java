// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Customer Managed Identity
 * 
 */
public final class WorkbookManagedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkbookManagedIdentityArgs Empty = new WorkbookManagedIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public WorkbookManagedIdentityArgs(@Nullable Output<String> type) {
        this.type = type;
    }

    private WorkbookManagedIdentityArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkbookManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkbookManagedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public WorkbookManagedIdentityArgs build() {
            return new WorkbookManagedIdentityArgs(type);
        }
    }
}
