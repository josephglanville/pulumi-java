// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.compute.VirtualMachineRunCommandByVirtualMachineArgs;
import io.pulumi.azurenative.compute.outputs.RunCommandInputParameterResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineRunCommandInstanceViewResponse;
import io.pulumi.azurenative.compute.outputs.VirtualMachineRunCommandScriptSourceResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:compute:VirtualMachineRunCommandByVirtualMachine")
public class VirtualMachineRunCommandByVirtualMachine extends io.pulumi.resources.CustomResource {
    @OutputExport(name="asyncExecution", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> asyncExecution;

    public Output</* @Nullable */ Boolean> getAsyncExecution() {
        return this.asyncExecution;
    }
    @OutputExport(name="errorBlobUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> errorBlobUri;

    public Output</* @Nullable */ String> getErrorBlobUri() {
        return this.errorBlobUri;
    }
    @OutputExport(name="instanceView", type=VirtualMachineRunCommandInstanceViewResponse.class, parameters={})
    private Output<VirtualMachineRunCommandInstanceViewResponse> instanceView;

    public Output<VirtualMachineRunCommandInstanceViewResponse> getInstanceView() {
        return this.instanceView;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="outputBlobUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> outputBlobUri;

    public Output</* @Nullable */ String> getOutputBlobUri() {
        return this.outputBlobUri;
    }
    @OutputExport(name="parameters", type=List.class, parameters={RunCommandInputParameterResponse.class})
    private Output</* @Nullable */ List<RunCommandInputParameterResponse>> parameters;

    public Output</* @Nullable */ List<RunCommandInputParameterResponse>> getParameters() {
        return this.parameters;
    }
    @OutputExport(name="protectedParameters", type=List.class, parameters={RunCommandInputParameterResponse.class})
    private Output</* @Nullable */ List<RunCommandInputParameterResponse>> protectedParameters;

    public Output</* @Nullable */ List<RunCommandInputParameterResponse>> getProtectedParameters() {
        return this.protectedParameters;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="runAsPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> runAsPassword;

    public Output</* @Nullable */ String> getRunAsPassword() {
        return this.runAsPassword;
    }
    @OutputExport(name="runAsUser", type=String.class, parameters={})
    private Output</* @Nullable */ String> runAsUser;

    public Output</* @Nullable */ String> getRunAsUser() {
        return this.runAsUser;
    }
    @OutputExport(name="source", type=VirtualMachineRunCommandScriptSourceResponse.class, parameters={})
    private Output</* @Nullable */ VirtualMachineRunCommandScriptSourceResponse> source;

    public Output</* @Nullable */ VirtualMachineRunCommandScriptSourceResponse> getSource() {
        return this.source;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="timeoutInSeconds", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> timeoutInSeconds;

    public Output</* @Nullable */ Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public VirtualMachineRunCommandByVirtualMachine(String name, VirtualMachineRunCommandByVirtualMachineArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineRunCommandByVirtualMachine", name, args == null ? VirtualMachineRunCommandByVirtualMachineArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private VirtualMachineRunCommandByVirtualMachine(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:VirtualMachineRunCommandByVirtualMachine", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:compute/v20200601:VirtualMachineRunCommandByVirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20201201:VirtualMachineRunCommandByVirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210301:VirtualMachineRunCommandByVirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210401:VirtualMachineRunCommandByVirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20210701:VirtualMachineRunCommandByVirtualMachine").build()),
                Input.of(Alias.builder().setType("azure-native:compute/v20211101:VirtualMachineRunCommandByVirtualMachine").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static VirtualMachineRunCommandByVirtualMachine get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMachineRunCommandByVirtualMachine(name, id, options);
    }
}