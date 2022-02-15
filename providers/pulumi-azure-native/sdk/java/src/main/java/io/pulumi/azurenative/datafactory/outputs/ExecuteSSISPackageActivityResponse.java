// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.ActivityDependencyResponse;
import io.pulumi.azurenative.datafactory.outputs.ActivityPolicyResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.SSISExecutionCredentialResponse;
import io.pulumi.azurenative.datafactory.outputs.SSISExecutionParameterResponse;
import io.pulumi.azurenative.datafactory.outputs.SSISLogLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.SSISPackageLocationResponse;
import io.pulumi.azurenative.datafactory.outputs.SSISPropertyOverrideResponse;
import io.pulumi.azurenative.datafactory.outputs.UserPropertyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ExecuteSSISPackageActivityResponse {
    private final IntegrationRuntimeReferenceResponse connectVia;
    private final @Nullable List<ActivityDependencyResponse> dependsOn;
    private final @Nullable String description;
    private final @Nullable Object environmentPath;
    private final @Nullable SSISExecutionCredentialResponse executionCredential;
    private final @Nullable LinkedServiceReferenceResponse linkedServiceName;
    private final @Nullable SSISLogLocationResponse logLocation;
    private final @Nullable Object loggingLevel;
    private final String name;
    private final @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers;
    private final SSISPackageLocationResponse packageLocation;
    private final @Nullable Map<String,SSISExecutionParameterResponse> packageParameters;
    private final @Nullable ActivityPolicyResponse policy;
    private final @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers;
    private final @Nullable Map<String,SSISExecutionParameterResponse> projectParameters;
    private final @Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides;
    private final @Nullable Object runtime;
    private final String type;
    private final @Nullable List<UserPropertyResponse> userProperties;

    @OutputCustomType.Constructor({"connectVia","dependsOn","description","environmentPath","executionCredential","linkedServiceName","logLocation","loggingLevel","name","packageConnectionManagers","packageLocation","packageParameters","policy","projectConnectionManagers","projectParameters","propertyOverrides","runtime","type","userProperties"})
    private ExecuteSSISPackageActivityResponse(
        IntegrationRuntimeReferenceResponse connectVia,
        @Nullable List<ActivityDependencyResponse> dependsOn,
        @Nullable String description,
        @Nullable Object environmentPath,
        @Nullable SSISExecutionCredentialResponse executionCredential,
        @Nullable LinkedServiceReferenceResponse linkedServiceName,
        @Nullable SSISLogLocationResponse logLocation,
        @Nullable Object loggingLevel,
        String name,
        @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers,
        SSISPackageLocationResponse packageLocation,
        @Nullable Map<String,SSISExecutionParameterResponse> packageParameters,
        @Nullable ActivityPolicyResponse policy,
        @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers,
        @Nullable Map<String,SSISExecutionParameterResponse> projectParameters,
        @Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides,
        @Nullable Object runtime,
        String type,
        @Nullable List<UserPropertyResponse> userProperties) {
        this.connectVia = Objects.requireNonNull(connectVia);
        this.dependsOn = dependsOn;
        this.description = description;
        this.environmentPath = environmentPath;
        this.executionCredential = executionCredential;
        this.linkedServiceName = linkedServiceName;
        this.logLocation = logLocation;
        this.loggingLevel = loggingLevel;
        this.name = Objects.requireNonNull(name);
        this.packageConnectionManagers = packageConnectionManagers;
        this.packageLocation = Objects.requireNonNull(packageLocation);
        this.packageParameters = packageParameters;
        this.policy = policy;
        this.projectConnectionManagers = projectConnectionManagers;
        this.projectParameters = projectParameters;
        this.propertyOverrides = propertyOverrides;
        this.runtime = runtime;
        this.type = Objects.requireNonNull(type);
        this.userProperties = userProperties;
    }

    public IntegrationRuntimeReferenceResponse getConnectVia() {
        return this.connectVia;
    }
    public List<ActivityDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Object> getEnvironmentPath() {
        return Optional.ofNullable(this.environmentPath);
    }
    public Optional<SSISExecutionCredentialResponse> getExecutionCredential() {
        return Optional.ofNullable(this.executionCredential);
    }
    public Optional<LinkedServiceReferenceResponse> getLinkedServiceName() {
        return Optional.ofNullable(this.linkedServiceName);
    }
    public Optional<SSISLogLocationResponse> getLogLocation() {
        return Optional.ofNullable(this.logLocation);
    }
    public Optional<Object> getLoggingLevel() {
        return Optional.ofNullable(this.loggingLevel);
    }
    public String getName() {
        return this.name;
    }
    public Map<String,Map<String,SSISExecutionParameterResponse>> getPackageConnectionManagers() {
        return this.packageConnectionManagers == null ? Map.of() : this.packageConnectionManagers;
    }
    public SSISPackageLocationResponse getPackageLocation() {
        return this.packageLocation;
    }
    public Map<String,SSISExecutionParameterResponse> getPackageParameters() {
        return this.packageParameters == null ? Map.of() : this.packageParameters;
    }
    public Optional<ActivityPolicyResponse> getPolicy() {
        return Optional.ofNullable(this.policy);
    }
    public Map<String,Map<String,SSISExecutionParameterResponse>> getProjectConnectionManagers() {
        return this.projectConnectionManagers == null ? Map.of() : this.projectConnectionManagers;
    }
    public Map<String,SSISExecutionParameterResponse> getProjectParameters() {
        return this.projectParameters == null ? Map.of() : this.projectParameters;
    }
    public Map<String,SSISPropertyOverrideResponse> getPropertyOverrides() {
        return this.propertyOverrides == null ? Map.of() : this.propertyOverrides;
    }
    public Optional<Object> getRuntime() {
        return Optional.ofNullable(this.runtime);
    }
    public String getType() {
        return this.type;
    }
    public List<UserPropertyResponse> getUserProperties() {
        return this.userProperties == null ? List.of() : this.userProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteSSISPackageActivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable List<ActivityDependencyResponse> dependsOn;
        private @Nullable String description;
        private @Nullable Object environmentPath;
        private @Nullable SSISExecutionCredentialResponse executionCredential;
        private @Nullable LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable SSISLogLocationResponse logLocation;
        private @Nullable Object loggingLevel;
        private String name;
        private @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers;
        private SSISPackageLocationResponse packageLocation;
        private @Nullable Map<String,SSISExecutionParameterResponse> packageParameters;
        private @Nullable ActivityPolicyResponse policy;
        private @Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers;
        private @Nullable Map<String,SSISExecutionParameterResponse> projectParameters;
        private @Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides;
        private @Nullable Object runtime;
        private String type;
        private @Nullable List<UserPropertyResponse> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteSSISPackageActivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVia = defaults.connectVia;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.environmentPath = defaults.environmentPath;
    	      this.executionCredential = defaults.executionCredential;
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.logLocation = defaults.logLocation;
    	      this.loggingLevel = defaults.loggingLevel;
    	      this.name = defaults.name;
    	      this.packageConnectionManagers = defaults.packageConnectionManagers;
    	      this.packageLocation = defaults.packageLocation;
    	      this.packageParameters = defaults.packageParameters;
    	      this.policy = defaults.policy;
    	      this.projectConnectionManagers = defaults.projectConnectionManagers;
    	      this.projectParameters = defaults.projectParameters;
    	      this.propertyOverrides = defaults.propertyOverrides;
    	      this.runtime = defaults.runtime;
    	      this.type = defaults.type;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder setConnectVia(IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = Objects.requireNonNull(connectVia);
            return this;
        }

        public Builder setDependsOn(@Nullable List<ActivityDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnvironmentPath(@Nullable Object environmentPath) {
            this.environmentPath = environmentPath;
            return this;
        }

        public Builder setExecutionCredential(@Nullable SSISExecutionCredentialResponse executionCredential) {
            this.executionCredential = executionCredential;
            return this;
        }

        public Builder setLinkedServiceName(@Nullable LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = linkedServiceName;
            return this;
        }

        public Builder setLogLocation(@Nullable SSISLogLocationResponse logLocation) {
            this.logLocation = logLocation;
            return this;
        }

        public Builder setLoggingLevel(@Nullable Object loggingLevel) {
            this.loggingLevel = loggingLevel;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPackageConnectionManagers(@Nullable Map<String,Map<String,SSISExecutionParameterResponse>> packageConnectionManagers) {
            this.packageConnectionManagers = packageConnectionManagers;
            return this;
        }

        public Builder setPackageLocation(SSISPackageLocationResponse packageLocation) {
            this.packageLocation = Objects.requireNonNull(packageLocation);
            return this;
        }

        public Builder setPackageParameters(@Nullable Map<String,SSISExecutionParameterResponse> packageParameters) {
            this.packageParameters = packageParameters;
            return this;
        }

        public Builder setPolicy(@Nullable ActivityPolicyResponse policy) {
            this.policy = policy;
            return this;
        }

        public Builder setProjectConnectionManagers(@Nullable Map<String,Map<String,SSISExecutionParameterResponse>> projectConnectionManagers) {
            this.projectConnectionManagers = projectConnectionManagers;
            return this;
        }

        public Builder setProjectParameters(@Nullable Map<String,SSISExecutionParameterResponse> projectParameters) {
            this.projectParameters = projectParameters;
            return this;
        }

        public Builder setPropertyOverrides(@Nullable Map<String,SSISPropertyOverrideResponse> propertyOverrides) {
            this.propertyOverrides = propertyOverrides;
            return this;
        }

        public Builder setRuntime(@Nullable Object runtime) {
            this.runtime = runtime;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserProperties(@Nullable List<UserPropertyResponse> userProperties) {
            this.userProperties = userProperties;
            return this;
        }

        public ExecuteSSISPackageActivityResponse build() {
            return new ExecuteSSISPackageActivityResponse(connectVia, dependsOn, description, environmentPath, executionCredential, linkedServiceName, logLocation, loggingLevel, name, packageConnectionManagers, packageLocation, packageParameters, policy, projectConnectionManagers, projectParameters, propertyOverrides, runtime, type, userProperties);
        }
    }
}