// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.MitigationActionUpdateDeviceCertificateParamsAction;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
 * 
 */
public final class MitigationActionUpdateDeviceCertificateParamsArgs extends io.pulumi.resources.ResourceArgs {

    public static final MitigationActionUpdateDeviceCertificateParamsArgs Empty = new MitigationActionUpdateDeviceCertificateParamsArgs();

    @InputImport(name="action", required=true)
      private final Input<MitigationActionUpdateDeviceCertificateParamsAction> action;

    public Input<MitigationActionUpdateDeviceCertificateParamsAction> getAction() {
        return this.action;
    }

    public MitigationActionUpdateDeviceCertificateParamsArgs(Input<MitigationActionUpdateDeviceCertificateParamsAction> action) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
    }

    private MitigationActionUpdateDeviceCertificateParamsArgs() {
        this.action = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionUpdateDeviceCertificateParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<MitigationActionUpdateDeviceCertificateParamsAction> action;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionUpdateDeviceCertificateParamsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder setAction(Input<MitigationActionUpdateDeviceCertificateParamsAction> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setAction(MitigationActionUpdateDeviceCertificateParamsAction action) {
            this.action = Input.of(Objects.requireNonNull(action));
            return this;
        }
        public MitigationActionUpdateDeviceCertificateParamsArgs build() {
            return new MitigationActionUpdateDeviceCertificateParamsArgs(action);
        }
    }
}
