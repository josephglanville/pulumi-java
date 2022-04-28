// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PetArgs extends ResourceArgs {

    public static final PetArgs Empty = new PetArgs();

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private PetArgs() {}

    private PetArgs(PetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PetArgs $;

        public Builder() {
            $ = new PetArgs();
        }

        public Builder(PetArgs defaults) {
            $ = new PetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public PetArgs build() {
            return $;
        }
    }

}
