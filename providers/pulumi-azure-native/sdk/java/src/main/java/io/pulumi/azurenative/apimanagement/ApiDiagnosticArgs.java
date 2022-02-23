// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.AlwaysLog;
import io.pulumi.azurenative.apimanagement.enums.HttpCorrelationProtocol;
import io.pulumi.azurenative.apimanagement.enums.OperationNameFormat;
import io.pulumi.azurenative.apimanagement.enums.Verbosity;
import io.pulumi.azurenative.apimanagement.inputs.PipelineDiagnosticSettingsArgs;
import io.pulumi.azurenative.apimanagement.inputs.SamplingSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiDiagnosticArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiDiagnosticArgs Empty = new ApiDiagnosticArgs();

    /**
     * Specifies for what type of messages sampling settings should not apply.
     * 
     */
    @InputImport(name="alwaysLog")
      private final @Nullable Input<Either<String,AlwaysLog>> alwaysLog;

    public Input<Either<String,AlwaysLog>> getAlwaysLog() {
        return this.alwaysLog == null ? Input.empty() : this.alwaysLog;
    }

    /**
     * API identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Backend
     * 
     */
    @InputImport(name="backend")
      private final @Nullable Input<PipelineDiagnosticSettingsArgs> backend;

    public Input<PipelineDiagnosticSettingsArgs> getBackend() {
        return this.backend == null ? Input.empty() : this.backend;
    }

    /**
     * Diagnostic identifier. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="diagnosticId")
      private final @Nullable Input<String> diagnosticId;

    public Input<String> getDiagnosticId() {
        return this.diagnosticId == null ? Input.empty() : this.diagnosticId;
    }

    /**
     * Diagnostic settings for incoming/outgoing HTTP messages to the Gateway.
     * 
     */
    @InputImport(name="frontend")
      private final @Nullable Input<PipelineDiagnosticSettingsArgs> frontend;

    public Input<PipelineDiagnosticSettingsArgs> getFrontend() {
        return this.frontend == null ? Input.empty() : this.frontend;
    }

    /**
     * Sets correlation protocol to use for Application Insights diagnostics.
     * 
     */
    @InputImport(name="httpCorrelationProtocol")
      private final @Nullable Input<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol;

    public Input<Either<String,HttpCorrelationProtocol>> getHttpCorrelationProtocol() {
        return this.httpCorrelationProtocol == null ? Input.empty() : this.httpCorrelationProtocol;
    }

    /**
     * Log the ClientIP. Default is false.
     * 
     */
    @InputImport(name="logClientIp")
      private final @Nullable Input<Boolean> logClientIp;

    public Input<Boolean> getLogClientIp() {
        return this.logClientIp == null ? Input.empty() : this.logClientIp;
    }

    /**
     * Resource Id of a target logger.
     * 
     */
    @InputImport(name="loggerId", required=true)
      private final Input<String> loggerId;

    public Input<String> getLoggerId() {
        return this.loggerId;
    }

    /**
     * The format of the Operation Name for Application Insights telemetries. Default is Name.
     * 
     */
    @InputImport(name="operationNameFormat")
      private final @Nullable Input<Either<String,OperationNameFormat>> operationNameFormat;

    public Input<Either<String,OperationNameFormat>> getOperationNameFormat() {
        return this.operationNameFormat == null ? Input.empty() : this.operationNameFormat;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sampling settings for Diagnostic.
     * 
     */
    @InputImport(name="sampling")
      private final @Nullable Input<SamplingSettingsArgs> sampling;

    public Input<SamplingSettingsArgs> getSampling() {
        return this.sampling == null ? Input.empty() : this.sampling;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
      private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * The verbosity level applied to traces emitted by trace policies.
     * 
     */
    @InputImport(name="verbosity")
      private final @Nullable Input<Either<String,Verbosity>> verbosity;

    public Input<Either<String,Verbosity>> getVerbosity() {
        return this.verbosity == null ? Input.empty() : this.verbosity;
    }

    public ApiDiagnosticArgs(
        @Nullable Input<Either<String,AlwaysLog>> alwaysLog,
        Input<String> apiId,
        @Nullable Input<PipelineDiagnosticSettingsArgs> backend,
        @Nullable Input<String> diagnosticId,
        @Nullable Input<PipelineDiagnosticSettingsArgs> frontend,
        @Nullable Input<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol,
        @Nullable Input<Boolean> logClientIp,
        Input<String> loggerId,
        @Nullable Input<Either<String,OperationNameFormat>> operationNameFormat,
        Input<String> resourceGroupName,
        @Nullable Input<SamplingSettingsArgs> sampling,
        Input<String> serviceName,
        @Nullable Input<Either<String,Verbosity>> verbosity) {
        this.alwaysLog = alwaysLog;
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.backend = backend;
        this.diagnosticId = diagnosticId;
        this.frontend = frontend;
        this.httpCorrelationProtocol = httpCorrelationProtocol;
        this.logClientIp = logClientIp;
        this.loggerId = Objects.requireNonNull(loggerId, "expected parameter 'loggerId' to be non-null");
        this.operationNameFormat = operationNameFormat;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sampling = sampling;
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.verbosity = verbosity;
    }

    private ApiDiagnosticArgs() {
        this.alwaysLog = Input.empty();
        this.apiId = Input.empty();
        this.backend = Input.empty();
        this.diagnosticId = Input.empty();
        this.frontend = Input.empty();
        this.httpCorrelationProtocol = Input.empty();
        this.logClientIp = Input.empty();
        this.loggerId = Input.empty();
        this.operationNameFormat = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sampling = Input.empty();
        this.serviceName = Input.empty();
        this.verbosity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiDiagnosticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,AlwaysLog>> alwaysLog;
        private Input<String> apiId;
        private @Nullable Input<PipelineDiagnosticSettingsArgs> backend;
        private @Nullable Input<String> diagnosticId;
        private @Nullable Input<PipelineDiagnosticSettingsArgs> frontend;
        private @Nullable Input<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol;
        private @Nullable Input<Boolean> logClientIp;
        private Input<String> loggerId;
        private @Nullable Input<Either<String,OperationNameFormat>> operationNameFormat;
        private Input<String> resourceGroupName;
        private @Nullable Input<SamplingSettingsArgs> sampling;
        private Input<String> serviceName;
        private @Nullable Input<Either<String,Verbosity>> verbosity;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiDiagnosticArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alwaysLog = defaults.alwaysLog;
    	      this.apiId = defaults.apiId;
    	      this.backend = defaults.backend;
    	      this.diagnosticId = defaults.diagnosticId;
    	      this.frontend = defaults.frontend;
    	      this.httpCorrelationProtocol = defaults.httpCorrelationProtocol;
    	      this.logClientIp = defaults.logClientIp;
    	      this.loggerId = defaults.loggerId;
    	      this.operationNameFormat = defaults.operationNameFormat;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sampling = defaults.sampling;
    	      this.serviceName = defaults.serviceName;
    	      this.verbosity = defaults.verbosity;
        }

        public Builder setAlwaysLog(@Nullable Input<Either<String,AlwaysLog>> alwaysLog) {
            this.alwaysLog = alwaysLog;
            return this;
        }

        public Builder setAlwaysLog(@Nullable Either<String,AlwaysLog> alwaysLog) {
            this.alwaysLog = Input.ofNullable(alwaysLog);
            return this;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setBackend(@Nullable Input<PipelineDiagnosticSettingsArgs> backend) {
            this.backend = backend;
            return this;
        }

        public Builder setBackend(@Nullable PipelineDiagnosticSettingsArgs backend) {
            this.backend = Input.ofNullable(backend);
            return this;
        }

        public Builder setDiagnosticId(@Nullable Input<String> diagnosticId) {
            this.diagnosticId = diagnosticId;
            return this;
        }

        public Builder setDiagnosticId(@Nullable String diagnosticId) {
            this.diagnosticId = Input.ofNullable(diagnosticId);
            return this;
        }

        public Builder setFrontend(@Nullable Input<PipelineDiagnosticSettingsArgs> frontend) {
            this.frontend = frontend;
            return this;
        }

        public Builder setFrontend(@Nullable PipelineDiagnosticSettingsArgs frontend) {
            this.frontend = Input.ofNullable(frontend);
            return this;
        }

        public Builder setHttpCorrelationProtocol(@Nullable Input<Either<String,HttpCorrelationProtocol>> httpCorrelationProtocol) {
            this.httpCorrelationProtocol = httpCorrelationProtocol;
            return this;
        }

        public Builder setHttpCorrelationProtocol(@Nullable Either<String,HttpCorrelationProtocol> httpCorrelationProtocol) {
            this.httpCorrelationProtocol = Input.ofNullable(httpCorrelationProtocol);
            return this;
        }

        public Builder setLogClientIp(@Nullable Input<Boolean> logClientIp) {
            this.logClientIp = logClientIp;
            return this;
        }

        public Builder setLogClientIp(@Nullable Boolean logClientIp) {
            this.logClientIp = Input.ofNullable(logClientIp);
            return this;
        }

        public Builder setLoggerId(Input<String> loggerId) {
            this.loggerId = Objects.requireNonNull(loggerId);
            return this;
        }

        public Builder setLoggerId(String loggerId) {
            this.loggerId = Input.of(Objects.requireNonNull(loggerId));
            return this;
        }

        public Builder setOperationNameFormat(@Nullable Input<Either<String,OperationNameFormat>> operationNameFormat) {
            this.operationNameFormat = operationNameFormat;
            return this;
        }

        public Builder setOperationNameFormat(@Nullable Either<String,OperationNameFormat> operationNameFormat) {
            this.operationNameFormat = Input.ofNullable(operationNameFormat);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSampling(@Nullable Input<SamplingSettingsArgs> sampling) {
            this.sampling = sampling;
            return this;
        }

        public Builder setSampling(@Nullable SamplingSettingsArgs sampling) {
            this.sampling = Input.ofNullable(sampling);
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder setVerbosity(@Nullable Input<Either<String,Verbosity>> verbosity) {
            this.verbosity = verbosity;
            return this;
        }

        public Builder setVerbosity(@Nullable Either<String,Verbosity> verbosity) {
            this.verbosity = Input.ofNullable(verbosity);
            return this;
        }
        public ApiDiagnosticArgs build() {
            return new ApiDiagnosticArgs(alwaysLog, apiId, backend, diagnosticId, frontend, httpCorrelationProtocol, logClientIp, loggerId, operationNameFormat, resourceGroupName, sampling, serviceName, verbosity);
        }
    }
}
