// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.RunCommandInputParameterArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineRunCommandScriptSourceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineScaleSetVMRunCommandArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetVMRunCommandArgs Empty = new VirtualMachineScaleSetVMRunCommandArgs();

    /**
     * Optional. If set to true, provisioning will complete as soon as the script starts and will not wait for script to complete.
     * 
     */
    @InputImport(name="asyncExecution")
      private final @Nullable Output<Boolean> asyncExecution;

    public Output<Boolean> getAsyncExecution() {
        return this.asyncExecution == null ? Output.empty() : this.asyncExecution;
    }

    /**
     * Specifies the Azure storage blob where script error stream will be uploaded.
     * 
     */
    @InputImport(name="errorBlobUri")
      private final @Nullable Output<String> errorBlobUri;

    public Output<String> getErrorBlobUri() {
        return this.errorBlobUri == null ? Output.empty() : this.errorBlobUri;
    }

    /**
     * The instance ID of the virtual machine.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Specifies the Azure storage blob where script output stream will be uploaded.
     * 
     */
    @InputImport(name="outputBlobUri")
      private final @Nullable Output<String> outputBlobUri;

    public Output<String> getOutputBlobUri() {
        return this.outputBlobUri == null ? Output.empty() : this.outputBlobUri;
    }

    /**
     * The parameters used by the script.
     * 
     */
    @InputImport(name="parameters")
      private final @Nullable Output<List<RunCommandInputParameterArgs>> parameters;

    public Output<List<RunCommandInputParameterArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The parameters used by the script.
     * 
     */
    @InputImport(name="protectedParameters")
      private final @Nullable Output<List<RunCommandInputParameterArgs>> protectedParameters;

    public Output<List<RunCommandInputParameterArgs>> getProtectedParameters() {
        return this.protectedParameters == null ? Output.empty() : this.protectedParameters;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the user account password on the VM when executing the run command.
     * 
     */
    @InputImport(name="runAsPassword")
      private final @Nullable Output<String> runAsPassword;

    public Output<String> getRunAsPassword() {
        return this.runAsPassword == null ? Output.empty() : this.runAsPassword;
    }

    /**
     * Specifies the user account on the VM when executing the run command.
     * 
     */
    @InputImport(name="runAsUser")
      private final @Nullable Output<String> runAsUser;

    public Output<String> getRunAsUser() {
        return this.runAsUser == null ? Output.empty() : this.runAsUser;
    }

    /**
     * The name of the virtual machine run command.
     * 
     */
    @InputImport(name="runCommandName")
      private final @Nullable Output<String> runCommandName;

    public Output<String> getRunCommandName() {
        return this.runCommandName == null ? Output.empty() : this.runCommandName;
    }

    /**
     * The source of the run command script.
     * 
     */
    @InputImport(name="source")
      private final @Nullable Output<VirtualMachineRunCommandScriptSourceArgs> source;

    public Output<VirtualMachineRunCommandScriptSourceArgs> getSource() {
        return this.source == null ? Output.empty() : this.source;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The timeout in seconds to execute the run command.
     * 
     */
    @InputImport(name="timeoutInSeconds")
      private final @Nullable Output<Integer> timeoutInSeconds;

    public Output<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Output.empty() : this.timeoutInSeconds;
    }

    /**
     * The name of the VM scale set.
     * 
     */
    @InputImport(name="vmScaleSetName", required=true)
      private final Output<String> vmScaleSetName;

    public Output<String> getVmScaleSetName() {
        return this.vmScaleSetName;
    }

    public VirtualMachineScaleSetVMRunCommandArgs(
        @Nullable Output<Boolean> asyncExecution,
        @Nullable Output<String> errorBlobUri,
        Output<String> instanceId,
        @Nullable Output<String> location,
        @Nullable Output<String> outputBlobUri,
        @Nullable Output<List<RunCommandInputParameterArgs>> parameters,
        @Nullable Output<List<RunCommandInputParameterArgs>> protectedParameters,
        Output<String> resourceGroupName,
        @Nullable Output<String> runAsPassword,
        @Nullable Output<String> runAsUser,
        @Nullable Output<String> runCommandName,
        @Nullable Output<VirtualMachineRunCommandScriptSourceArgs> source,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Integer> timeoutInSeconds,
        Output<String> vmScaleSetName) {
        this.asyncExecution = asyncExecution == null ? Output.ofNullable(false) : asyncExecution;
        this.errorBlobUri = errorBlobUri;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.location = location;
        this.outputBlobUri = outputBlobUri;
        this.parameters = parameters;
        this.protectedParameters = protectedParameters;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.runAsPassword = runAsPassword;
        this.runAsUser = runAsUser;
        this.runCommandName = runCommandName;
        this.source = source;
        this.tags = tags;
        this.timeoutInSeconds = timeoutInSeconds;
        this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
    }

    private VirtualMachineScaleSetVMRunCommandArgs() {
        this.asyncExecution = Output.empty();
        this.errorBlobUri = Output.empty();
        this.instanceId = Output.empty();
        this.location = Output.empty();
        this.outputBlobUri = Output.empty();
        this.parameters = Output.empty();
        this.protectedParameters = Output.empty();
        this.resourceGroupName = Output.empty();
        this.runAsPassword = Output.empty();
        this.runAsUser = Output.empty();
        this.runCommandName = Output.empty();
        this.source = Output.empty();
        this.tags = Output.empty();
        this.timeoutInSeconds = Output.empty();
        this.vmScaleSetName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMRunCommandArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> asyncExecution;
        private @Nullable Output<String> errorBlobUri;
        private Output<String> instanceId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> outputBlobUri;
        private @Nullable Output<List<RunCommandInputParameterArgs>> parameters;
        private @Nullable Output<List<RunCommandInputParameterArgs>> protectedParameters;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> runAsPassword;
        private @Nullable Output<String> runAsUser;
        private @Nullable Output<String> runCommandName;
        private @Nullable Output<VirtualMachineRunCommandScriptSourceArgs> source;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Integer> timeoutInSeconds;
        private Output<String> vmScaleSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMRunCommandArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asyncExecution = defaults.asyncExecution;
    	      this.errorBlobUri = defaults.errorBlobUri;
    	      this.instanceId = defaults.instanceId;
    	      this.location = defaults.location;
    	      this.outputBlobUri = defaults.outputBlobUri;
    	      this.parameters = defaults.parameters;
    	      this.protectedParameters = defaults.protectedParameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.runAsPassword = defaults.runAsPassword;
    	      this.runAsUser = defaults.runAsUser;
    	      this.runCommandName = defaults.runCommandName;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
    	      this.vmScaleSetName = defaults.vmScaleSetName;
        }

        public Builder asyncExecution(@Nullable Output<Boolean> asyncExecution) {
            this.asyncExecution = asyncExecution;
            return this;
        }

        public Builder asyncExecution(@Nullable Boolean asyncExecution) {
            this.asyncExecution = Output.ofNullable(asyncExecution);
            return this;
        }

        public Builder errorBlobUri(@Nullable Output<String> errorBlobUri) {
            this.errorBlobUri = errorBlobUri;
            return this;
        }

        public Builder errorBlobUri(@Nullable String errorBlobUri) {
            this.errorBlobUri = Output.ofNullable(errorBlobUri);
            return this;
        }

        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder outputBlobUri(@Nullable Output<String> outputBlobUri) {
            this.outputBlobUri = outputBlobUri;
            return this;
        }

        public Builder outputBlobUri(@Nullable String outputBlobUri) {
            this.outputBlobUri = Output.ofNullable(outputBlobUri);
            return this;
        }

        public Builder parameters(@Nullable Output<List<RunCommandInputParameterArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder parameters(@Nullable List<RunCommandInputParameterArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }

        public Builder protectedParameters(@Nullable Output<List<RunCommandInputParameterArgs>> protectedParameters) {
            this.protectedParameters = protectedParameters;
            return this;
        }

        public Builder protectedParameters(@Nullable List<RunCommandInputParameterArgs> protectedParameters) {
            this.protectedParameters = Output.ofNullable(protectedParameters);
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

        public Builder runAsPassword(@Nullable Output<String> runAsPassword) {
            this.runAsPassword = runAsPassword;
            return this;
        }

        public Builder runAsPassword(@Nullable String runAsPassword) {
            this.runAsPassword = Output.ofNullable(runAsPassword);
            return this;
        }

        public Builder runAsUser(@Nullable Output<String> runAsUser) {
            this.runAsUser = runAsUser;
            return this;
        }

        public Builder runAsUser(@Nullable String runAsUser) {
            this.runAsUser = Output.ofNullable(runAsUser);
            return this;
        }

        public Builder runCommandName(@Nullable Output<String> runCommandName) {
            this.runCommandName = runCommandName;
            return this;
        }

        public Builder runCommandName(@Nullable String runCommandName) {
            this.runCommandName = Output.ofNullable(runCommandName);
            return this;
        }

        public Builder source(@Nullable Output<VirtualMachineRunCommandScriptSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder source(@Nullable VirtualMachineRunCommandScriptSourceArgs source) {
            this.source = Output.ofNullable(source);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Output<Integer> timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }

        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = Output.ofNullable(timeoutInSeconds);
            return this;
        }

        public Builder vmScaleSetName(Output<String> vmScaleSetName) {
            this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName);
            return this;
        }

        public Builder vmScaleSetName(String vmScaleSetName) {
            this.vmScaleSetName = Output.of(Objects.requireNonNull(vmScaleSetName));
            return this;
        }
        public VirtualMachineScaleSetVMRunCommandArgs build() {
            return new VirtualMachineScaleSetVMRunCommandArgs(asyncExecution, errorBlobUri, instanceId, location, outputBlobUri, parameters, protectedParameters, resourceGroupName, runAsPassword, runAsUser, runCommandName, source, tags, timeoutInSeconds, vmScaleSetName);
        }
    }
}
