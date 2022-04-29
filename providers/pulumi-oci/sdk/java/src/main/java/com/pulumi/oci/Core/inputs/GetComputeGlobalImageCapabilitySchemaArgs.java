// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetComputeGlobalImageCapabilitySchemaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComputeGlobalImageCapabilitySchemaArgs Empty = new GetComputeGlobalImageCapabilitySchemaArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute global image capability schema
     * 
     */
    @Import(name="computeGlobalImageCapabilitySchemaId", required=true)
    private String computeGlobalImageCapabilitySchemaId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute global image capability schema
     * 
     */
    public String computeGlobalImageCapabilitySchemaId() {
        return this.computeGlobalImageCapabilitySchemaId;
    }

    private GetComputeGlobalImageCapabilitySchemaArgs() {}

    private GetComputeGlobalImageCapabilitySchemaArgs(GetComputeGlobalImageCapabilitySchemaArgs $) {
        this.computeGlobalImageCapabilitySchemaId = $.computeGlobalImageCapabilitySchemaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComputeGlobalImageCapabilitySchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComputeGlobalImageCapabilitySchemaArgs $;

        public Builder() {
            $ = new GetComputeGlobalImageCapabilitySchemaArgs();
        }

        public Builder(GetComputeGlobalImageCapabilitySchemaArgs defaults) {
            $ = new GetComputeGlobalImageCapabilitySchemaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeGlobalImageCapabilitySchemaId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compute global image capability schema
         * 
         * @return builder
         * 
         */
        public Builder computeGlobalImageCapabilitySchemaId(String computeGlobalImageCapabilitySchemaId) {
            $.computeGlobalImageCapabilitySchemaId = computeGlobalImageCapabilitySchemaId;
            return this;
        }

        public GetComputeGlobalImageCapabilitySchemaArgs build() {
            $.computeGlobalImageCapabilitySchemaId = Objects.requireNonNull($.computeGlobalImageCapabilitySchemaId, "expected parameter 'computeGlobalImageCapabilitySchemaId' to be non-null");
            return $;
        }
    }

}
