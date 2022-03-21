// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * The configuration used for a Replay.
 * 
 */
public final class GoogleCloudPolicysimulatorV1ReplayConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudPolicysimulatorV1ReplayConfigResponse Empty = new GoogleCloudPolicysimulatorV1ReplayConfigResponse();

    /**
     * The logs to use as input for the Replay.
     * 
     */
    @Import(name="logSource", required=true)
      private final String logSource;

    public String getLogSource() {
        return this.logSource;
    }

    /**
     * A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
     * 
     */
    @Import(name="policyOverlay", required=true)
      private final Map<String,String> policyOverlay;

    public Map<String,String> getPolicyOverlay() {
        return this.policyOverlay;
    }

    public GoogleCloudPolicysimulatorV1ReplayConfigResponse(
        String logSource,
        Map<String,String> policyOverlay) {
        this.logSource = Objects.requireNonNull(logSource, "expected parameter 'logSource' to be non-null");
        this.policyOverlay = Objects.requireNonNull(policyOverlay, "expected parameter 'policyOverlay' to be non-null");
    }

    private GoogleCloudPolicysimulatorV1ReplayConfigResponse() {
        this.logSource = null;
        this.policyOverlay = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudPolicysimulatorV1ReplayConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logSource;
        private Map<String,String> policyOverlay;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudPolicysimulatorV1ReplayConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logSource = defaults.logSource;
    	      this.policyOverlay = defaults.policyOverlay;
        }

        public Builder logSource(String logSource) {
            this.logSource = Objects.requireNonNull(logSource);
            return this;
        }
        public Builder policyOverlay(Map<String,String> policyOverlay) {
            this.policyOverlay = Objects.requireNonNull(policyOverlay);
            return this;
        }        public GoogleCloudPolicysimulatorV1ReplayConfigResponse build() {
            return new GoogleCloudPolicysimulatorV1ReplayConfigResponse(logSource, policyOverlay);
        }
    }
}
