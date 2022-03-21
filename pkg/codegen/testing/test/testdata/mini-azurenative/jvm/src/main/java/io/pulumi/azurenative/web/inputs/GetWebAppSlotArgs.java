// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppSlotArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppSlotArgs Empty = new GetWebAppSlotArgs();

    /**
     * Name of the deployment slot. By default, this API returns the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final String slot;

    public String getSlot() {
        return this.slot;
    }

    public GetWebAppSlotArgs(String slot) {
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
    }

    private GetWebAppSlotArgs() {
        this.slot = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String slot;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.slot = defaults.slot;
        }

        public Builder slot(String slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }        public GetWebAppSlotArgs build() {
            return new GetWebAppSlotArgs(slot);
        }
    }
}
