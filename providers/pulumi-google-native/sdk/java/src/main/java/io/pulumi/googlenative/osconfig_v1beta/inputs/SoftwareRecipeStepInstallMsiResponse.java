// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Installs an MSI file.
 * 
 */
public final class SoftwareRecipeStepInstallMsiResponse extends io.pulumi.resources.InvokeArgs {

    public static final SoftwareRecipeStepInstallMsiResponse Empty = new SoftwareRecipeStepInstallMsiResponse();

    /**
     * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
     * 
     */
    @Import(name="allowedExitCodes", required=true)
      private final List<Integer> allowedExitCodes;

    public List<Integer> getAllowedExitCodes() {
        return this.allowedExitCodes;
    }

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
      private final String artifactId;

    public String getArtifactId() {
        return this.artifactId;
    }

    /**
     * The flags to use when installing the MSI defaults to ["/i"] (i.e. the install flag).
     * 
     */
    @Import(name="flags", required=true)
      private final List<String> flags;

    public List<String> getFlags() {
        return this.flags;
    }

    public SoftwareRecipeStepInstallMsiResponse(
        List<Integer> allowedExitCodes,
        String artifactId,
        List<String> flags) {
        this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes, "expected parameter 'allowedExitCodes' to be non-null");
        this.artifactId = Objects.requireNonNull(artifactId, "expected parameter 'artifactId' to be non-null");
        this.flags = Objects.requireNonNull(flags, "expected parameter 'flags' to be non-null");
    }

    private SoftwareRecipeStepInstallMsiResponse() {
        this.allowedExitCodes = List.of();
        this.artifactId = null;
        this.flags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareRecipeStepInstallMsiResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> allowedExitCodes;
        private String artifactId;
        private List<String> flags;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareRecipeStepInstallMsiResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.artifactId = defaults.artifactId;
    	      this.flags = defaults.flags;
        }

        public Builder allowedExitCodes(List<Integer> allowedExitCodes) {
            this.allowedExitCodes = Objects.requireNonNull(allowedExitCodes);
            return this;
        }
        public Builder allowedExitCodes(Integer... allowedExitCodes) {
            return allowedExitCodes(List.of(allowedExitCodes));
        }
        public Builder artifactId(String artifactId) {
            this.artifactId = Objects.requireNonNull(artifactId);
            return this;
        }
        public Builder flags(List<String> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }
        public Builder flags(String... flags) {
            return flags(List.of(flags));
        }        public SoftwareRecipeStepInstallMsiResponse build() {
            return new SoftwareRecipeStepInstallMsiResponse(allowedExitCodes, artifactId, flags);
        }
    }
}
