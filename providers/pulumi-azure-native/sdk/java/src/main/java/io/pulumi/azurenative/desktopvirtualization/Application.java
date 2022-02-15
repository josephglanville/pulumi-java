// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.desktopvirtualization.ApplicationArgs;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:desktopvirtualization:Application")
public class Application extends io.pulumi.resources.CustomResource {
    @OutputExport(name="applicationType", type=String.class, parameters={})
    private Output</* @Nullable */ String> applicationType;

    public Output</* @Nullable */ String> getApplicationType() {
        return this.applicationType;
    }
    @OutputExport(name="commandLineArguments", type=String.class, parameters={})
    private Output</* @Nullable */ String> commandLineArguments;

    public Output</* @Nullable */ String> getCommandLineArguments() {
        return this.commandLineArguments;
    }
    @OutputExport(name="commandLineSetting", type=String.class, parameters={})
    private Output<String> commandLineSetting;

    public Output<String> getCommandLineSetting() {
        return this.commandLineSetting;
    }
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    @OutputExport(name="filePath", type=String.class, parameters={})
    private Output</* @Nullable */ String> filePath;

    public Output</* @Nullable */ String> getFilePath() {
        return this.filePath;
    }
    @OutputExport(name="friendlyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> friendlyName;

    public Output</* @Nullable */ String> getFriendlyName() {
        return this.friendlyName;
    }
    @OutputExport(name="iconContent", type=String.class, parameters={})
    private Output<String> iconContent;

    public Output<String> getIconContent() {
        return this.iconContent;
    }
    @OutputExport(name="iconHash", type=String.class, parameters={})
    private Output<String> iconHash;

    public Output<String> getIconHash() {
        return this.iconHash;
    }
    @OutputExport(name="iconIndex", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> iconIndex;

    public Output</* @Nullable */ Integer> getIconIndex() {
        return this.iconIndex;
    }
    @OutputExport(name="iconPath", type=String.class, parameters={})
    private Output</* @Nullable */ String> iconPath;

    public Output</* @Nullable */ String> getIconPath() {
        return this.iconPath;
    }
    @OutputExport(name="msixPackageApplicationId", type=String.class, parameters={})
    private Output</* @Nullable */ String> msixPackageApplicationId;

    public Output</* @Nullable */ String> getMsixPackageApplicationId() {
        return this.msixPackageApplicationId;
    }
    @OutputExport(name="msixPackageFamilyName", type=String.class, parameters={})
    private Output</* @Nullable */ String> msixPackageFamilyName;

    public Output</* @Nullable */ String> getMsixPackageFamilyName() {
        return this.msixPackageFamilyName;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="objectId", type=String.class, parameters={})
    private Output<String> objectId;

    public Output<String> getObjectId() {
        return this.objectId;
    }
    @OutputExport(name="showInPortal", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> showInPortal;

    public Output</* @Nullable */ Boolean> getShowInPortal() {
        return this.showInPortal;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public Application(String name, ApplicationArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Application(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:desktopvirtualization:Application", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20190123preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20190924preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20191210preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20200921preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201019preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201102preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20201110preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210114preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210201preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210309preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210401preview:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210712:Application").build()),
                Input.of(Alias.builder().setType("azure-native:desktopvirtualization/v20210903preview:Application").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Application get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, options);
    }
}