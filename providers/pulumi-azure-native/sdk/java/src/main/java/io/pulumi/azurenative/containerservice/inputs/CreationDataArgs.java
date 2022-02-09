// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CreationDataArgs extends io.pulumi.resources.ResourceArgs {

    public static final CreationDataArgs Empty = new CreationDataArgs();

    @InputImport(name="sourceResourceId")
    private final @Nullable Input<String> sourceResourceId;

    public Input<String> getSourceResourceId() {
        return this.sourceResourceId == null ? Input.empty() : this.sourceResourceId;
    }

    public CreationDataArgs(@Nullable Input<String> sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    private CreationDataArgs() {
        this.sourceResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CreationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> sourceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(CreationDataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceResourceId = defaults.sourceResourceId;
        }

        public Builder setSourceResourceId(@Nullable Input<String> sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        public Builder setSourceResourceId(@Nullable String sourceResourceId) {
            this.sourceResourceId = Input.ofNullable(sourceResourceId);
            return this;
        }

        public CreationDataArgs build() {
            return new CreationDataArgs(sourceResourceId);
        }
    }
}
