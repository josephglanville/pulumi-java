// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RunbookAssociationPropertyResponse {
    /**
     * Gets or sets the name of the runbook.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private RunbookAssociationPropertyResponse(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * Gets or sets the name of the runbook.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
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

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public RunbookAssociationPropertyResponse build() {
            return new RunbookAssociationPropertyResponse(name);
        }
    }
}
