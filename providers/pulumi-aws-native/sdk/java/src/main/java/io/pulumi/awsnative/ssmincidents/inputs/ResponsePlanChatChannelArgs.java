// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmincidents.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The chat channel configuration.
 * 
 */
public final class ResponsePlanChatChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponsePlanChatChannelArgs Empty = new ResponsePlanChatChannelArgs();

    @Import(name="chatbotSns")
      private final @Nullable Output<List<String>> chatbotSns;

    public Output<List<String>> getChatbotSns() {
        return this.chatbotSns == null ? Codegen.empty() : this.chatbotSns;
    }

    public ResponsePlanChatChannelArgs(@Nullable Output<List<String>> chatbotSns) {
        this.chatbotSns = chatbotSns;
    }

    private ResponsePlanChatChannelArgs() {
        this.chatbotSns = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanChatChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> chatbotSns;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanChatChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.chatbotSns = defaults.chatbotSns;
        }

        public Builder chatbotSns(@Nullable Output<List<String>> chatbotSns) {
            this.chatbotSns = chatbotSns;
            return this;
        }
        public Builder chatbotSns(@Nullable List<String> chatbotSns) {
            this.chatbotSns = Codegen.ofNullable(chatbotSns);
            return this;
        }
        public Builder chatbotSns(String... chatbotSns) {
            return chatbotSns(List.of(chatbotSns));
        }        public ResponsePlanChatChannelArgs build() {
            return new ResponsePlanChatChannelArgs(chatbotSns);
        }
    }
}
