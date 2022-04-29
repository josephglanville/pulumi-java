// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetByoipRangeArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetByoipRangeArgs Empty = new GetByoipRangeArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the `ByoipRange` resource containing the BYOIP CIDR block.
     * 
     */
    @Import(name="byoipRangeId", required=true)
    private String byoipRangeId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the `ByoipRange` resource containing the BYOIP CIDR block.
     * 
     */
    public String byoipRangeId() {
        return this.byoipRangeId;
    }

    private GetByoipRangeArgs() {}

    private GetByoipRangeArgs(GetByoipRangeArgs $) {
        this.byoipRangeId = $.byoipRangeId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetByoipRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetByoipRangeArgs $;

        public Builder() {
            $ = new GetByoipRangeArgs();
        }

        public Builder(GetByoipRangeArgs defaults) {
            $ = new GetByoipRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param byoipRangeId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the `ByoipRange` resource containing the BYOIP CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder byoipRangeId(String byoipRangeId) {
            $.byoipRangeId = byoipRangeId;
            return this;
        }

        public GetByoipRangeArgs build() {
            $.byoipRangeId = Objects.requireNonNull($.byoipRangeId, "expected parameter 'byoipRangeId' to be non-null");
            return $;
        }
    }

}
