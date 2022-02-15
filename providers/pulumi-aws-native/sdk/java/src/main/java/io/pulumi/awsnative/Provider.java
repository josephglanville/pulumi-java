// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative;

import io.pulumi.awsnative.ProviderArgs;
import io.pulumi.awsnative.Utilities;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="pulumi:providers:aws-native")
public class Provider extends io.pulumi.resources.ProviderResource {
    @OutputExport(name="profile", type=String.class, parameters={})
    private Output</* @Nullable */ String> profile;

    public Output</* @Nullable */ String> getProfile() {
        return this.profile;
    }
    @OutputExport(name="region", type=String.class, parameters={})
    private Output</* @Nullable */ String> region;

    public Output</* @Nullable */ String> getRegion() {
        return this.region;
    }
    @OutputExport(name="sharedCredentialsFile", type=String.class, parameters={})
    private Output</* @Nullable */ String> sharedCredentialsFile;

    public Output</* @Nullable */ String> getSharedCredentialsFile() {
        return this.sharedCredentialsFile;
    }

    public Provider(String name, ProviderArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}