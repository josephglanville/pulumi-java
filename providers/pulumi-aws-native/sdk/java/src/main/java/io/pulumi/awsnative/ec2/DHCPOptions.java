// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.Utilities;
import io.pulumi.awsnative.ec2.DHCPOptionsArgs;
import io.pulumi.awsnative.ec2.outputs.DHCPOptionsTag;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="aws-native:ec2:DHCPOptions")
public class DHCPOptions extends io.pulumi.resources.CustomResource {
    @OutputExport(name="dhcpOptionsId", type=String.class, parameters={})
    private Output<String> dhcpOptionsId;

    public Output<String> getDhcpOptionsId() {
        return this.dhcpOptionsId;
    }
    @OutputExport(name="domainName", type=String.class, parameters={})
    private Output</* @Nullable */ String> domainName;

    public Output</* @Nullable */ String> getDomainName() {
        return this.domainName;
    }
    @OutputExport(name="domainNameServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> domainNameServers;

    public Output</* @Nullable */ List<String>> getDomainNameServers() {
        return this.domainNameServers;
    }
    @OutputExport(name="netbiosNameServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> netbiosNameServers;

    public Output</* @Nullable */ List<String>> getNetbiosNameServers() {
        return this.netbiosNameServers;
    }
    @OutputExport(name="netbiosNodeType", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> netbiosNodeType;

    public Output</* @Nullable */ Integer> getNetbiosNodeType() {
        return this.netbiosNodeType;
    }
    @OutputExport(name="ntpServers", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> ntpServers;

    public Output</* @Nullable */ List<String>> getNtpServers() {
        return this.ntpServers;
    }
    @OutputExport(name="tags", type=List.class, parameters={DHCPOptionsTag.class})
    private Output</* @Nullable */ List<DHCPOptionsTag>> tags;

    public Output</* @Nullable */ List<DHCPOptionsTag>> getTags() {
        return this.tags;
    }

    public DHCPOptions(String name, @Nullable DHCPOptionsArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:DHCPOptions", name, args == null ? DHCPOptionsArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private DHCPOptions(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:ec2:DHCPOptions", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static DHCPOptions get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DHCPOptions(name, id, options);
    }
}