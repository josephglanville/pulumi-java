// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myPkg.myMod_childB;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.myPkg.Utilities;
import com.pulumi.myPkg.myMod_childA.MemberA1;
import com.pulumi.myPkg.myMod_childA.enums.EnumA;
import com.pulumi.myPkg.myMod_childA.outputs.ObjectA;
import com.pulumi.myPkg.myMod_childB.MemberB1;
import com.pulumi.myPkg.myMod_childB.MemberB2Args;
import com.pulumi.myPkg.myMod_childB.enums.EnumB;
import com.pulumi.myPkg.myMod_childB.outputs.ObjectB;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="myPkg:myMod/childB:MemberB2")
public class MemberB2 extends com.pulumi.resources.ComponentResource {
    @Export(name="enumFromDifferentModule", refs={EnumA.class}, tree="[0]")
    private Output</* @Nullable */ EnumA> enumFromDifferentModule;

    public Output<Optional<EnumA>> enumFromDifferentModule() {
        return Codegen.optional(this.enumFromDifferentModule);
    }
    @Export(name="enumFromSameModule", refs={EnumB.class}, tree="[0]")
    private Output</* @Nullable */ EnumB> enumFromSameModule;

    public Output<Optional<EnumB>> enumFromSameModule() {
        return Codegen.optional(this.enumFromSameModule);
    }
    @Export(name="objectFromDifferentModule", refs={ObjectA.class}, tree="[0]")
    private Output</* @Nullable */ ObjectA> objectFromDifferentModule;

    public Output<Optional<ObjectA>> objectFromDifferentModule() {
        return Codegen.optional(this.objectFromDifferentModule);
    }
    @Export(name="objectFromSameModule", refs={ObjectB.class}, tree="[0]")
    private Output</* @Nullable */ ObjectB> objectFromSameModule;

    public Output<Optional<ObjectB>> objectFromSameModule() {
        return Codegen.optional(this.objectFromSameModule);
    }
    @Export(name="resourceFromDifferentModule", refs={MemberA1.class}, tree="[0]")
    private Output</* @Nullable */ MemberA1> resourceFromDifferentModule;

    public Output<Optional<MemberA1>> resourceFromDifferentModule() {
        return Codegen.optional(this.resourceFromDifferentModule);
    }
    @Export(name="resourceFromSameModule", refs={MemberB1.class}, tree="[0]")
    private Output</* @Nullable */ MemberB1> resourceFromSameModule;

    public Output<Optional<MemberB1>> resourceFromSameModule() {
        return Codegen.optional(this.resourceFromSameModule);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MemberB2(String name) {
        this(name, MemberB2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MemberB2(String name, @Nullable MemberB2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MemberB2(String name, @Nullable MemberB2Args args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("myPkg:myMod/childB:MemberB2", name, args == null ? MemberB2Args.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
