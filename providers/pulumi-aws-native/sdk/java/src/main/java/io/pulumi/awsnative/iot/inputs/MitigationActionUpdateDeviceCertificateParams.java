// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.MitigationActionUpdateDeviceCertificateParamsAction;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * Parameters to define a mitigation action that changes the state of the device certificate to inactive.
 * 
 */
public final class MitigationActionUpdateDeviceCertificateParams extends io.pulumi.resources.InvokeArgs {

    public static final MitigationActionUpdateDeviceCertificateParams Empty = new MitigationActionUpdateDeviceCertificateParams();

    @Import(name="action", required=true)
      private final MitigationActionUpdateDeviceCertificateParamsAction action;

    public MitigationActionUpdateDeviceCertificateParamsAction getAction() {
        return this.action;
    }

    public MitigationActionUpdateDeviceCertificateParams(MitigationActionUpdateDeviceCertificateParamsAction action) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
    }

    private MitigationActionUpdateDeviceCertificateParams() {
        this.action = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MitigationActionUpdateDeviceCertificateParams defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MitigationActionUpdateDeviceCertificateParamsAction action;

        public Builder() {
    	      // Empty
        }

        public Builder(MitigationActionUpdateDeviceCertificateParams defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
        }

        public Builder action(MitigationActionUpdateDeviceCertificateParamsAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }        public MitigationActionUpdateDeviceCertificateParams build() {
            return new MitigationActionUpdateDeviceCertificateParams(action);
        }
    }
}
