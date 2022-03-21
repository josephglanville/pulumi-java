// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The schedule property associated with the entity.
 * 
 */
public final class ScheduleAssociationPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScheduleAssociationPropertyResponse Empty = new ScheduleAssociationPropertyResponse();

    /**
     * Gets or sets the name of the Schedule.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    public ScheduleAssociationPropertyResponse(@Nullable String name) {
        this.name = name;
    }

    private ScheduleAssociationPropertyResponse() {
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleAssociationPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduleAssociationPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public ScheduleAssociationPropertyResponse build() {
            return new ScheduleAssociationPropertyResponse(name);
        }
    }
}
