// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureMembershipConfigmanagementPolicyControllerGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureMembershipConfigmanagementPolicyControllerGetArgs Empty = new FeatureMembershipConfigmanagementPolicyControllerGetArgs();

    /**
     * Sets the interval for Policy Controller Audit Scans (in seconds). When set to 0, this disables audit functionality altogether.
     * 
     */
    @Import(name="auditIntervalSeconds")
      private final @Nullable Output<String> auditIntervalSeconds;

    public Output<String> getAuditIntervalSeconds() {
        return this.auditIntervalSeconds == null ? Output.empty() : this.auditIntervalSeconds;
    }

    /**
     * Enables the installation of Policy Controller. If false, the rest of PolicyController fields take no effect.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * The set of namespaces that are excluded from Policy Controller checks. Namespaces do not need to currently exist on the cluster.
     * 
     */
    @Import(name="exemptableNamespaces")
      private final @Nullable Output<List<String>> exemptableNamespaces;

    public Output<List<String>> getExemptableNamespaces() {
        return this.exemptableNamespaces == null ? Output.empty() : this.exemptableNamespaces;
    }

    /**
     * Logs all denies and dry run failures.
     * 
     */
    @Import(name="logDeniesEnabled")
      private final @Nullable Output<Boolean> logDeniesEnabled;

    public Output<Boolean> getLogDeniesEnabled() {
        return this.logDeniesEnabled == null ? Output.empty() : this.logDeniesEnabled;
    }

    /**
     * Enables the ability to use Constraint Templates that reference to objects other than the object currently being evaluated.
     * 
     */
    @Import(name="referentialRulesEnabled")
      private final @Nullable Output<Boolean> referentialRulesEnabled;

    public Output<Boolean> getReferentialRulesEnabled() {
        return this.referentialRulesEnabled == null ? Output.empty() : this.referentialRulesEnabled;
    }

    /**
     * Installs the default template library along with Policy Controller.
     * 
     */
    @Import(name="templateLibraryInstalled")
      private final @Nullable Output<Boolean> templateLibraryInstalled;

    public Output<Boolean> getTemplateLibraryInstalled() {
        return this.templateLibraryInstalled == null ? Output.empty() : this.templateLibraryInstalled;
    }

    public FeatureMembershipConfigmanagementPolicyControllerGetArgs(
        @Nullable Output<String> auditIntervalSeconds,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<String>> exemptableNamespaces,
        @Nullable Output<Boolean> logDeniesEnabled,
        @Nullable Output<Boolean> referentialRulesEnabled,
        @Nullable Output<Boolean> templateLibraryInstalled) {
        this.auditIntervalSeconds = auditIntervalSeconds;
        this.enabled = enabled;
        this.exemptableNamespaces = exemptableNamespaces;
        this.logDeniesEnabled = logDeniesEnabled;
        this.referentialRulesEnabled = referentialRulesEnabled;
        this.templateLibraryInstalled = templateLibraryInstalled;
    }

    private FeatureMembershipConfigmanagementPolicyControllerGetArgs() {
        this.auditIntervalSeconds = Output.empty();
        this.enabled = Output.empty();
        this.exemptableNamespaces = Output.empty();
        this.logDeniesEnabled = Output.empty();
        this.referentialRulesEnabled = Output.empty();
        this.templateLibraryInstalled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementPolicyControllerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> auditIntervalSeconds;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<String>> exemptableNamespaces;
        private @Nullable Output<Boolean> logDeniesEnabled;
        private @Nullable Output<Boolean> referentialRulesEnabled;
        private @Nullable Output<Boolean> templateLibraryInstalled;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureMembershipConfigmanagementPolicyControllerGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditIntervalSeconds = defaults.auditIntervalSeconds;
    	      this.enabled = defaults.enabled;
    	      this.exemptableNamespaces = defaults.exemptableNamespaces;
    	      this.logDeniesEnabled = defaults.logDeniesEnabled;
    	      this.referentialRulesEnabled = defaults.referentialRulesEnabled;
    	      this.templateLibraryInstalled = defaults.templateLibraryInstalled;
        }

        public Builder auditIntervalSeconds(@Nullable Output<String> auditIntervalSeconds) {
            this.auditIntervalSeconds = auditIntervalSeconds;
            return this;
        }
        public Builder auditIntervalSeconds(@Nullable String auditIntervalSeconds) {
            this.auditIntervalSeconds = Output.ofNullable(auditIntervalSeconds);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder exemptableNamespaces(@Nullable Output<List<String>> exemptableNamespaces) {
            this.exemptableNamespaces = exemptableNamespaces;
            return this;
        }
        public Builder exemptableNamespaces(@Nullable List<String> exemptableNamespaces) {
            this.exemptableNamespaces = Output.ofNullable(exemptableNamespaces);
            return this;
        }
        public Builder exemptableNamespaces(String... exemptableNamespaces) {
            return exemptableNamespaces(List.of(exemptableNamespaces));
        }
        public Builder logDeniesEnabled(@Nullable Output<Boolean> logDeniesEnabled) {
            this.logDeniesEnabled = logDeniesEnabled;
            return this;
        }
        public Builder logDeniesEnabled(@Nullable Boolean logDeniesEnabled) {
            this.logDeniesEnabled = Output.ofNullable(logDeniesEnabled);
            return this;
        }
        public Builder referentialRulesEnabled(@Nullable Output<Boolean> referentialRulesEnabled) {
            this.referentialRulesEnabled = referentialRulesEnabled;
            return this;
        }
        public Builder referentialRulesEnabled(@Nullable Boolean referentialRulesEnabled) {
            this.referentialRulesEnabled = Output.ofNullable(referentialRulesEnabled);
            return this;
        }
        public Builder templateLibraryInstalled(@Nullable Output<Boolean> templateLibraryInstalled) {
            this.templateLibraryInstalled = templateLibraryInstalled;
            return this;
        }
        public Builder templateLibraryInstalled(@Nullable Boolean templateLibraryInstalled) {
            this.templateLibraryInstalled = Output.ofNullable(templateLibraryInstalled);
            return this;
        }        public FeatureMembershipConfigmanagementPolicyControllerGetArgs build() {
            return new FeatureMembershipConfigmanagementPolicyControllerGetArgs(auditIntervalSeconds, enabled, exemptableNamespaces, logDeniesEnabled, referentialRulesEnabled, templateLibraryInstalled);
        }
    }
}
