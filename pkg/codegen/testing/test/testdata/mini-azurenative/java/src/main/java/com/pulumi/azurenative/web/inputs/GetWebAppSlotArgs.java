// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppSlotArgs extends InvokeArgs {

    public static final GetWebAppSlotArgs Empty = new GetWebAppSlotArgs();

    /**
     * Name of the deployment slot. By default, this API returns the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private String slot;

    /**
     * @return Name of the deployment slot. By default, this API returns the production slot.
     * 
     */
    public String slot() {
        return this.slot;
    }

    private GetWebAppSlotArgs() {}

    private GetWebAppSlotArgs(GetWebAppSlotArgs $) {
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppSlotArgs $;

        public Builder() {
            $ = new GetWebAppSlotArgs();
        }

        public Builder(GetWebAppSlotArgs defaults) {
            $ = new GetWebAppSlotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param slot Name of the deployment slot. By default, this API returns the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            $.slot = slot;
            return this;
        }

        public GetWebAppSlotArgs build() {
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
