// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights;

import io.pulumi.azurenative.securityinsights.enums.CustomEntityQueryKind;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntityQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntityQueryArgs Empty = new EntityQueryArgs();

    /**
     * entity query ID
     * 
     */
    @Import(name="entityQueryId")
      private final @Nullable Output<String> entityQueryId;

    public Output<String> getEntityQueryId() {
        return this.entityQueryId == null ? Output.empty() : this.entityQueryId;
    }

    /**
     * the entity query kind
     * 
     */
    @Import(name="kind", required=true)
      private final Output<Either<String,CustomEntityQueryKind>> kind;

    public Output<Either<String,CustomEntityQueryKind>> getKind() {
        return this.kind;
    }

    /**
     * The namespace of workspaces resource provider- Microsoft.OperationalInsights.
     * 
     */
    @Import(name="operationalInsightsResourceProvider", required=true)
      private final Output<String> operationalInsightsResourceProvider;

    public Output<String> getOperationalInsightsResourceProvider() {
        return this.operationalInsightsResourceProvider;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public EntityQueryArgs(
        @Nullable Output<String> entityQueryId,
        Output<Either<String,CustomEntityQueryKind>> kind,
        Output<String> operationalInsightsResourceProvider,
        Output<String> resourceGroupName,
        Output<String> workspaceName) {
        this.entityQueryId = entityQueryId;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.operationalInsightsResourceProvider = Objects.requireNonNull(operationalInsightsResourceProvider, "expected parameter 'operationalInsightsResourceProvider' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private EntityQueryArgs() {
        this.entityQueryId = Output.empty();
        this.kind = Output.empty();
        this.operationalInsightsResourceProvider = Output.empty();
        this.resourceGroupName = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> entityQueryId;
        private Output<Either<String,CustomEntityQueryKind>> kind;
        private Output<String> operationalInsightsResourceProvider;
        private Output<String> resourceGroupName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityQueryId = defaults.entityQueryId;
    	      this.kind = defaults.kind;
    	      this.operationalInsightsResourceProvider = defaults.operationalInsightsResourceProvider;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder entityQueryId(@Nullable Output<String> entityQueryId) {
            this.entityQueryId = entityQueryId;
            return this;
        }
        public Builder entityQueryId(@Nullable String entityQueryId) {
            this.entityQueryId = Output.ofNullable(entityQueryId);
            return this;
        }
        public Builder kind(Output<Either<String,CustomEntityQueryKind>> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder kind(Either<String,CustomEntityQueryKind> kind) {
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
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public EntityQueryArgs build() {
            return new EntityQueryArgs(entityQueryId, kind, operationalInsightsResourceProvider, resourceGroupName, workspaceName);
        }
    }
}
