// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ImagingPolicyVideoArgs extends com.pulumi.resources.ResourceArgs {

    public static final ImagingPolicyVideoArgs Empty = new ImagingPolicyVideoArgs();

    /**
     * With this flag set to false, the user can perform modifications on staging without affecting the version already saved
     * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
     * it back to false only when there are any changes to the policy qualifying it for the new version.
     * 
     */
    @Import(name="activateOnProduction")
    private @Nullable Output<Boolean> activateOnProduction;

    /**
     * @return With this flag set to false, the user can perform modifications on staging without affecting the version already saved
     * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
     * it back to false only when there are any changes to the policy qualifying it for the new version.
     * 
     */
    public Optional<Output<Boolean>> activateOnProduction() {
        return Optional.ofNullable(this.activateOnProduction);
    }

    /**
     * Unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    @Import(name="contractId", required=true)
    private Output<String> contractId;

    /**
     * @return Unique identifier for the Akamai Contract containing the Policy Set(s)
     * 
     */
    public Output<String> contractId() {
        return this.contractId;
    }

    /**
     * A JSON encoded policy
     * 
     */
    @Import(name="json", required=true)
    private Output<String> json;

    /**
     * @return A JSON encoded policy
     * 
     */
    public Output<String> json() {
        return this.json;
    }

    /**
     * Unique identifier for a Policy. It is not possible to modify the id of the policy.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<String> policyId;

    /**
     * @return Unique identifier for a Policy. It is not possible to modify the id of the policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     * Unique identifier for the Image &amp; Video Manager Policy Set.
     * 
     */
    @Import(name="policysetId", required=true)
    private Output<String> policysetId;

    /**
     * @return Unique identifier for the Image &amp; Video Manager Policy Set.
     * 
     */
    public Output<String> policysetId() {
        return this.policysetId;
    }

    private ImagingPolicyVideoArgs() {}

    private ImagingPolicyVideoArgs(ImagingPolicyVideoArgs $) {
        this.activateOnProduction = $.activateOnProduction;
        this.contractId = $.contractId;
        this.json = $.json;
        this.policyId = $.policyId;
        this.policysetId = $.policysetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ImagingPolicyVideoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ImagingPolicyVideoArgs $;

        public Builder() {
            $ = new ImagingPolicyVideoArgs();
        }

        public Builder(ImagingPolicyVideoArgs defaults) {
            $ = new ImagingPolicyVideoArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param activateOnProduction With this flag set to false, the user can perform modifications on staging without affecting the version already saved
         * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
         * it back to false only when there are any changes to the policy qualifying it for the new version.
         * 
         * @return builder
         * 
         */
        public Builder activateOnProduction(@Nullable Output<Boolean> activateOnProduction) {
            $.activateOnProduction = activateOnProduction;
            return this;
        }

        /**
         * @param activateOnProduction With this flag set to false, the user can perform modifications on staging without affecting the version already saved
         * to production. With this flag set to true, the policy will be saved on the production network. It is possible to change
         * it back to false only when there are any changes to the policy qualifying it for the new version.
         * 
         * @return builder
         * 
         */
        public Builder activateOnProduction(Boolean activateOnProduction) {
            return activateOnProduction(Output.of(activateOnProduction));
        }

        /**
         * @param contractId Unique identifier for the Akamai Contract containing the Policy Set(s)
         * 
         * @return builder
         * 
         */
        public Builder contractId(Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param contractId Unique identifier for the Akamai Contract containing the Policy Set(s)
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        /**
         * @param json A JSON encoded policy
         * 
         * @return builder
         * 
         */
        public Builder json(Output<String> json) {
            $.json = json;
            return this;
        }

        /**
         * @param json A JSON encoded policy
         * 
         * @return builder
         * 
         */
        public Builder json(String json) {
            return json(Output.of(json));
        }

        /**
         * @param policyId Unique identifier for a Policy. It is not possible to modify the id of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId Unique identifier for a Policy. It is not possible to modify the id of the policy.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param policysetId Unique identifier for the Image &amp; Video Manager Policy Set.
         * 
         * @return builder
         * 
         */
        public Builder policysetId(Output<String> policysetId) {
            $.policysetId = policysetId;
            return this;
        }

        /**
         * @param policysetId Unique identifier for the Image &amp; Video Manager Policy Set.
         * 
         * @return builder
         * 
         */
        public Builder policysetId(String policysetId) {
            return policysetId(Output.of(policysetId));
        }

        public ImagingPolicyVideoArgs build() {
            if ($.contractId == null) {
                throw new MissingRequiredPropertyException("ImagingPolicyVideoArgs", "contractId");
            }
            if ($.json == null) {
                throw new MissingRequiredPropertyException("ImagingPolicyVideoArgs", "json");
            }
            if ($.policyId == null) {
                throw new MissingRequiredPropertyException("ImagingPolicyVideoArgs", "policyId");
            }
            if ($.policysetId == null) {
                throw new MissingRequiredPropertyException("ImagingPolicyVideoArgs", "policysetId");
            }
            return $;
        }
    }

}
