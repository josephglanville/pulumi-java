// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The runbook property associated with the entity.
 * 
 */
public final class RunbookAssociationPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final RunbookAssociationPropertyResponse Empty = new RunbookAssociationPropertyResponse();

    /**
     * Gets or sets the name of the runbook.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public RunbookAssociationPropertyResponse(@Nullable String name) {
        this.name = name;
    }

    private RunbookAssociationPropertyResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunbookAssociationPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RunbookAssociationPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }
        public RunbookAssociationPropertyResponse build() {
            return new RunbookAssociationPropertyResponse(name);
        }
    }
}
