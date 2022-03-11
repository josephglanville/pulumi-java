// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomaliesArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomaliesArgs Empty = new AnomaliesArgs();

    /**
     * The kind of the setting
     * Expected value is 'Anomalies'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Output<String> kind;

    public Output<String> getKind() {
        return this.kind;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @InputImport(name="operationalInsightsResourceProvider", required=true)
      private final Output<String> operationalInsightsResourceProvider;

    public Output<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The setting name. Supports - Anomalies, EyesOn, EntityAnalytics, Ueba
     * 
     */
    @InputImport(name="settingsName")
      private final @Nullable Output<String> settingsName;

    public Output<String> getSettingsName() {
        return this.settingsName == null ? Output.empty() : this.settingsName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @InputImport(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public AnomaliesArgs(
        Output<String> kind,
        Output<String> operationalInsightsResourceProvider,
        Output<String> resourceGroupName,
        @Nullable Output<String> settingsName,
        Output<String> workspaceName) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.settingsName = settingsName;
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private AnomaliesArgs() {
        this.kind = Output.empty();
        this.operationalInsightsResourceProvider = Output.empty();
        this.resourceGroupName = Output.empty();
        this.settingsName = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomaliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kind;
        private Output<String> operationalInsightsResourceProvider;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> settingsName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomaliesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.settingsName = defaults.settingsName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder kind(Output<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Output.of(Objects.requireNonNull(kind));
            return this;
        }

        public Builder operationalInsightsResourceProvider(Output<String> operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider);
            return this;
        }

        public Builder operationalInsightsResourceProvider(String operationalInsightsResourceProvider) {
            this.operationalInsightsResourceProvider = Output.of(Objects.requireNonNull(operationalInsightsResourceProvider));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder settingsName(@Nullable Output<String> settingsName) {
            this.settingsName = settingsName;
            return this;
        }

        public Builder settingsName(@Nullable String settingsName) {
            this.settingsName = Output.ofNullable(settingsName);
            return this;
        }

        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }

        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }
        public AnomaliesArgs build() {
            return new AnomaliesArgs(kind, operationalInsightsResourceProvider, resourceGroupName, settingsName, workspaceName);
        }
    }
}
