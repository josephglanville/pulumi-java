// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.foobar.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopLevelArgs extends ResourceArgs {

    public static final TopLevelArgs Empty = new TopLevelArgs();

    @Import(name="buzz")
    private @Nullable Output<String> buzz;

    public Optional<Output<String>> buzz() {
        return Optional.ofNullable(this.buzz);
    }

    private TopLevelArgs() {}

    private TopLevelArgs(TopLevelArgs $) {
        this.buzz = $.buzz;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopLevelArgs $;

        public Builder() {
            $ = new TopLevelArgs();
        }

        public Builder(TopLevelArgs defaults) {
            $ = new TopLevelArgs(Objects.requireNonNull(defaults));
        }

        public Builder buzz(@Nullable Output<String> buzz) {
            $.buzz = buzz;
            return this;
        }

        public Builder buzz(String buzz) {
            return buzz(Output.of(buzz));
        }

        public TopLevelArgs build() {
            return $;
        }
    }

}
