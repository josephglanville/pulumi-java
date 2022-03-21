// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBotAliasArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBotAliasArgs Empty = new GetBotAliasArgs();

    @Import(name="botAliasId", required=true)
      private final String botAliasId;

    public String getBotAliasId() {
        return this.botAliasId;
    }

    @Import(name="botId", required=true)
      private final String botId;

    public String getBotId() {
        return this.botId;
    }

    public GetBotAliasArgs(
        String botAliasId,
        String botId) {
        this.botAliasId = Objects.requireNonNull(botAliasId, "expected parameter 'botAliasId' to be non-null");
        this.botId = Objects.requireNonNull(botId, "expected parameter 'botId' to be non-null");
    }

    private GetBotAliasArgs() {
        this.botAliasId = null;
        this.botId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBotAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String botAliasId;
        private String botId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBotAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.botAliasId = defaults.botAliasId;
    	      this.botId = defaults.botId;
        }

        public Builder botAliasId(String botAliasId) {
            this.botAliasId = Objects.requireNonNull(botAliasId);
            return this;
        }
        public Builder botId(String botId) {
            this.botId = Objects.requireNonNull(botId);
            return this;
        }        public GetBotAliasArgs build() {
            return new GetBotAliasArgs(botAliasId, botId);
        }
    }
}
